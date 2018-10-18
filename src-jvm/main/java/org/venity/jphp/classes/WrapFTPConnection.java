package org.venity.jphp.classes;

import com.guichaguri.minimalftp.FTPConnection;
import com.guichaguri.minimalftp.api.IFileSystem;
import org.venity.jphp.FTPServerExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

import java.io.InputStream;
import java.io.OutputStream;

@Reflection.Name("FTPConnection")
@Reflection.Namespace(FTPServerExtension.NS)
public class WrapFTPConnection extends BaseWrapper<FTPConnection> {

    public WrapFTPConnection(Environment env, FTPConnection wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapFTPConnection(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct() throws Exception {
        throw new Exception("Canot create FTPConnection object");
    }

    interface WrappedInterface {
        long getBytesTransferred();
        boolean isAuthenticated();
        String getUsername();
        boolean isAsciiMode();
        IFileSystem getFileSystem();
        void setFileSystem(IFileSystem fs);
        boolean isSSLEnabled();
        void sendResponse(int code, String response);
        void sendData(InputStream in);
        void receiveData(OutputStream out);
        void abortDataTransfers();
        void registerFeature(String feat);
        void registerOption(String option, String value);
        String getOption(String option);
        String getSiteHelpMessage(String label);
        String getHelpMessage(String label);
        void close();
    }
}
