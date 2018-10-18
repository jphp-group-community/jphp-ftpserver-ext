package org.venity.jphp.classes;

import com.guichaguri.minimalftp.api.IFileSystem;
import org.venity.jphp.FTPServerExtension;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.memory.LongMemory;
import php.runtime.memory.StringMemory;
import php.runtime.reflection.ClassEntity;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Reflection.Abstract
@Reflection.Name("FileSystem")
@Reflection.Namespace(FTPServerExtension.NS)
public class WrapFileSystem extends BaseWrapper<IFileSystem> {
    public WrapFileSystem(Environment env, IFileSystem wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapFileSystem(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct() {

        WrapFileSystem lol = this;

        __wrappedObject = new IFileSystem<File>() {
            @Override
            public File getRoot() {
                try {
                    return (File) Memory.unwrap(getEnvironment(), getEnvironment().invokeMethod(lol, "getRoot", null).toObject(getEnvironment()));
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }

                return null;
            }

            @Override
            public String getPath(File file) {
                try {
                    return getEnvironment().invokeMethod(lol, "getPath", Memory.wrap(getEnvironment(), file)).toString();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }

                return null;
            }

            @Override
            public boolean exists(File file) {
                try {
                    return getEnvironment().invokeMethod(lol, "exists", Memory.wrap(getEnvironment(), file)).toBoolean();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }

                return false;
            }

            @Override
            public boolean isDirectory(File file) {
                try {
                    return getEnvironment().invokeMethod(lol, "isDirectory", Memory.wrap(getEnvironment(), file)).toBoolean();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }

                return false;
            }

            @Override
            public int getPermissions(File file) {
                try {
                    return (int) Memory.unwrap(getEnvironment(), getEnvironment().invokeMethod(lol, "getPermissions", Memory.wrap(getEnvironment(), file)).toNumeric());
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }

                return 0;
            }

            @Override
            public long getSize(File file) {
                try {
                    return (int) Memory.unwrap(getEnvironment(), getEnvironment().invokeMethod(lol, "getSize", Memory.wrap(getEnvironment(), file)).toNumeric());
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }

                return 0;
            }

            @Override
            public long getLastModified(File file) {
                try {
                    return (int) Memory.unwrap(getEnvironment(), getEnvironment().invokeMethod(lol, "getLastModified", Memory.wrap(getEnvironment(), file)).toNumeric());
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }

                return 0;
            }

            @Override
            public int getHardLinks(File file) {
                try {
                    return (int) Memory.unwrap(getEnvironment(), getEnvironment().invokeMethod(lol, "getHardLinks", Memory.wrap(getEnvironment(), file)).toNumeric());
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }

                return 0;
            }

            @Override
            public String getName(File file) {
                try {
                    return getEnvironment().invokeMethod(lol, "getName", Memory.wrap(getEnvironment(), file)).toString();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }

                return null;
            }

            @Override
            public String getOwner(File file) {
                try {
                    return getEnvironment().invokeMethod(lol, "getOwner", Memory.wrap(getEnvironment(), file)).toString();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }

                return null;
            }

            @Override
            public String getGroup(File file) {
                try {
                    return getEnvironment().invokeMethod(lol, "getGroup", Memory.wrap(getEnvironment(), file)).toString();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }

                return null;
            }

            @Override
            public File getParent(File file) throws IOException {
                try {
                    return (File) Memory.unwrap(getEnvironment(), getEnvironment().invokeMethod(lol, "getParent", Memory.wrap(getEnvironment(), file)).toObject(getEnvironment()));
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }

                return null;
            }

            @Override
            public File[] listFiles(File file) throws IOException {
                try {
                    return (File[]) Memory.unwrap(getEnvironment(), getEnvironment().invokeMethod(lol, "listFiles", Memory.wrap(getEnvironment(), file)).toObject(getEnvironment()), false);
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }

                return new File[0];
            }

            @Override
            public File findFile(String s) throws IOException {
                try {
                    return (File) Memory.unwrap(getEnvironment(), getEnvironment().invokeMethod(lol, "findFile", new StringMemory(s)).toObject(getEnvironment()));
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }

                return null;
            }

            @Override
            public File findFile(File file, String s) throws IOException {
                try {
                    return (File) Memory.unwrap(getEnvironment(), getEnvironment().invokeMethod(lol, "findFile", new StringMemory(s), Memory.wrap(getEnvironment(), file)).toObject(getEnvironment()));
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }

                return null;
            }

            @Override
            public InputStream readFile(File file, long l) throws IOException {
                try {
                    return (InputStream) Memory.unwrap(getEnvironment(), getEnvironment().invokeMethod(lol, "readFile", Memory.wrap(getEnvironment(), file), new LongMemory(l)).toObject(getEnvironment()));
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }

                return null;
            }

            @Override
            public OutputStream writeFile(File file, long l) throws IOException {
                try {
                    return (OutputStream) Memory.unwrap(getEnvironment(), getEnvironment().invokeMethod(lol, "writeFile", Memory.wrap(getEnvironment(), file), new LongMemory(l)).toObject(getEnvironment()));
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }

                return null;
            }

            @Override
            public void mkdirs(File file) throws IOException {
                try {
                    getEnvironment().invokeMethod(lol, "mkdirs", Memory.wrap(getEnvironment(), file));
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }

            @Override
            public void delete(File file) throws IOException {
                try {
                    getEnvironment().invokeMethod(lol, "delete", Memory.wrap(getEnvironment(), file));
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }

            @Override
            public void rename(File file, File f1) throws IOException {
                try {
                    getEnvironment().invokeMethod(lol, "rename",
                            Memory.wrap(getEnvironment(), file),
                            Memory.wrap(getEnvironment(), f1));
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }

            @Override
            public void chmod(File file, int i) throws IOException {
                try {
                    getEnvironment().invokeMethod(lol, "chmod",
                            Memory.wrap(getEnvironment(), file),
                            new LongMemory(i));
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }

            @Override
            public void touch(File file, long l) throws IOException {
                try {
                    getEnvironment().invokeMethod(lol, "touch",
                            Memory.wrap(getEnvironment(), file),
                            new LongMemory(l));
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }
        };
    }
}
