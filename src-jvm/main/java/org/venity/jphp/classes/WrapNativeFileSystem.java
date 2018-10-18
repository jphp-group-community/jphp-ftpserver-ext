package org.venity.jphp.classes;

import com.guichaguri.minimalftp.api.IFileSystem;
import com.guichaguri.minimalftp.impl.NativeFileSystem;
import org.venity.jphp.FTPServerExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

import java.io.File;

@Reflection.Name("NativeFileSystem")
@Reflection.Namespace(FTPServerExtension.NS)
public class WrapNativeFileSystem extends WrapFileSystem {
    public WrapNativeFileSystem(Environment env, NativeFileSystem wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapNativeFileSystem(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct() {
        __wrappedObject = new NativeFileSystem(new File(System.getProperty("user.home")));
    }

    @Reflection.Signature
    public void __construct(String path) {
        __wrappedObject = new NativeFileSystem(new File(path));
    }

    @Override
    public NativeFileSystem getWrappedObject() {
        return (NativeFileSystem) __wrappedObject;
    }
}
