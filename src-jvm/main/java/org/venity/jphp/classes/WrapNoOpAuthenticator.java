package org.venity.jphp.classes;

import com.guichaguri.minimalftp.api.IFileSystem;
import com.guichaguri.minimalftp.api.IUserAuthenticator;
import com.guichaguri.minimalftp.impl.NativeFileSystem;
import com.guichaguri.minimalftp.impl.NoOpAuthenticator;
import org.venity.jphp.FTPServerExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

import java.io.File;

@Reflection.Name("NoOpAuthenticator")
@Reflection.Namespace(FTPServerExtension.NS)
public class WrapNoOpAuthenticator extends WrapUserAuthenticator {
    public WrapNoOpAuthenticator(Environment env, IUserAuthenticator wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapNoOpAuthenticator(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct() {
        __wrappedObject = new NoOpAuthenticator(new NativeFileSystem(new File(System.getProperty("user.home"))));
    }

    @Reflection.Signature
    public void __construct(IFileSystem fileSystem) {
        __wrappedObject = new NoOpAuthenticator(fileSystem);
    }
}