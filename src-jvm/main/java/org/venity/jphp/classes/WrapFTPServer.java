package org.venity.jphp.classes;

import com.guichaguri.minimalftp.FTPServer;
import com.guichaguri.minimalftp.api.IUserAuthenticator;
import org.venity.jphp.FTPServerExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("FTPServer")
@Reflection.Namespace(FTPServerExtension.NS)
public class WrapFTPServer extends BaseWrapper<FTPServer> {

    public WrapFTPServer(Environment env, FTPServer wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapFTPServer(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct() {
        __wrappedObject = new FTPServer();
    }

    @Reflection.Signature
    public void __construct(IUserAuthenticator auth) {
        __wrappedObject = new FTPServer(auth);
    }

    interface WrappedInterface {
        void setTimeout(int idleTimeout);
        void setBufferSize(int bufferSize);
        int getPort();

        void listen(int port);
        void listenSync(int port);
        void close();

        void setAuthenticator(IUserAuthenticator auth);
        IUserAuthenticator getAuthenticator();
    }
}
