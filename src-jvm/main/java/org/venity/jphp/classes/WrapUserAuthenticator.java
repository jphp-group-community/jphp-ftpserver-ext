package org.venity.jphp.classes;

import com.guichaguri.minimalftp.FTPConnection;
import com.guichaguri.minimalftp.api.IFileSystem;
import com.guichaguri.minimalftp.api.IUserAuthenticator;
import org.venity.jphp.FTPServerExtension;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.memory.ObjectMemory;
import php.runtime.memory.StringMemory;
import php.runtime.reflection.ClassEntity;

import java.net.InetAddress;

@Reflection.Abstract
@Reflection.Name("UserAuthenticator")
@Reflection.Namespace(FTPServerExtension.NS)
public class WrapUserAuthenticator extends BaseWrapper<IUserAuthenticator> {

    public WrapUserAuthenticator(Environment env, IUserAuthenticator wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapUserAuthenticator(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct() {
        __wrappedObject = new IUserAuthenticator() {
            @Override
            public boolean needsUsername(FTPConnection ftpConnection) {
                return virtualNeedsUsername(ftpConnection);
            }

            @Override
            public boolean needsPassword(FTPConnection ftpConnection, String s, InetAddress inetAddress) {
                return virtualNeedsPassword(ftpConnection, s, inetAddress);
            }

            @Override
            public IFileSystem authenticate(FTPConnection ftpConnection, InetAddress inetAddress, String s, String s1) throws AuthException {
                return virtualAuthenticate(ftpConnection, inetAddress, s, s1);
            }
        };
    }

    private boolean virtualNeedsUsername(FTPConnection ftpConnection) {
        return getEnvironment().invokeMethodNoThrow(this, "needsUsername", new ObjectMemory(new WrapFTPConnection(getEnvironment(), ftpConnection))).toBoolean();
    }

    private boolean virtualNeedsPassword(FTPConnection ftpConnection, String s, InetAddress inetAddress) {
        return getEnvironment().invokeMethodNoThrow(this, "needsPassword",
                new ObjectMemory(new WrapFTPConnection(getEnvironment(), ftpConnection)),
                new StringMemory(s),
                new StringMemory(inetAddress.getHostAddress())).toBoolean();
    }

    private IFileSystem virtualAuthenticate(FTPConnection ftpConnection, InetAddress inetAddress, String s, String s1) {
        return (IFileSystem) Memory.unwrap(getEnvironment(), getEnvironment().invokeMethodNoThrow(this, "authenticate",
                new ObjectMemory(new WrapFTPConnection(getEnvironment(), ftpConnection)),
                new StringMemory(inetAddress.getHostAddress()),
                new StringMemory(s),
                new StringMemory(s1)).toObject(getEnvironment()));
    }
}