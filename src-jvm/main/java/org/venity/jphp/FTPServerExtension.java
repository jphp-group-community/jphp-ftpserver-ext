package org.venity.jphp;

import com.guichaguri.minimalftp.FTPConnection;
import com.guichaguri.minimalftp.FTPServer;
import com.guichaguri.minimalftp.api.IFileSystem;
import com.guichaguri.minimalftp.api.IUserAuthenticator;
import com.guichaguri.minimalftp.impl.NativeFileSystem;
import com.guichaguri.minimalftp.impl.NoOpAuthenticator;
import org.venity.jphp.classes.*;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

public class FTPServerExtension extends Extension {

    public static final String NS = "php\\ftp";
    
    @Override
    public Status getStatus() {
        return Status.STABLE;
    }

    @Override
    public String getName() {
        return "FTP Server";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public String[] getPackageNames() {
        return new String[] { "ftp" };
    }

    @Override
    public void onRegister(CompileScope scope) {
        registerWrapperClass(scope, FTPServer.class, WrapFTPServer.class);
        registerWrapperClass(scope, IUserAuthenticator.class, WrapUserAuthenticator.class);
        registerWrapperClass(scope, FTPConnection.class, WrapFTPConnection.class);
        registerWrapperClass(scope, IFileSystem.class, WrapFileSystem.class);
        registerWrapperClass(scope, NativeFileSystem.class, WrapNativeFileSystem.class);
        registerWrapperClass(scope, NoOpAuthenticator.class, WrapNoOpAuthenticator.class);
    }
}