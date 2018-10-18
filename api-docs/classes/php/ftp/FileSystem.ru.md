# FileSystem

- **класс** `FileSystem` (`php\ftp\FileSystem`)
- **исходники** `php/ftp/FileSystem.php`

**Классы наследники**

> [NativeFileSystem](https://github.com/jphp-group/jphp-ftpserver-ext/blob/master/api-docs/classes/php/ftp/NativeFileSystem.ru.md)

---

#### Методы

- `->`[`getRoot()`](#method-getroot)
- `->`[`getPath()`](#method-getpath)
- `->`[`exists()`](#method-exists)
- `->`[`isDirectory()`](#method-isdirectory)
- `->`[`getPermissions()`](#method-getpermissions)
- `->`[`getSize()`](#method-getsize)
- `->`[`getLastModified()`](#method-getlastmodified)
- `->`[`getHardLinks()`](#method-gethardlinks)
- `->`[`getName()`](#method-getname)
- `->`[`getOwner()`](#method-getowner)
- `->`[`getGroup()`](#method-getgroup)
- `->`[`getParent()`](#method-getparent)
- `->`[`listFiles()`](#method-listfiles)
- `->`[`findFile()`](#method-findfile)
- `->`[`readFile()`](#method-readfile)
- `->`[`writeFile()`](#method-writefile)
- `->`[`mkdirs()`](#method-mkdirs)
- `->`[`delete()`](#method-delete)
- `->`[`rename()`](#method-rename)
- `->`[`chmod()`](#method-chmod)
- `->`[`touch()`](#method-touch)

---
# Методы

<a name="method-getroot"></a>

### getRoot()
```php
getRoot(): php\io\File
```

---

<a name="method-getpath"></a>

### getPath()
```php
getPath(php\io\File $file): string
```

---

<a name="method-exists"></a>

### exists()
```php
exists(php\io\File $file): bool
```

---

<a name="method-isdirectory"></a>

### isDirectory()
```php
isDirectory(php\io\File $file): bool
```

---

<a name="method-getpermissions"></a>

### getPermissions()
```php
getPermissions(php\io\File $file): int
```

---

<a name="method-getsize"></a>

### getSize()
```php
getSize(php\io\File $file): float
```

---

<a name="method-getlastmodified"></a>

### getLastModified()
```php
getLastModified(php\io\File $file): float
```

---

<a name="method-gethardlinks"></a>

### getHardLinks()
```php
getHardLinks(php\io\File $file): int
```

---

<a name="method-getname"></a>

### getName()
```php
getName(php\io\File $file): string
```

---

<a name="method-getowner"></a>

### getOwner()
```php
getOwner(php\io\File $file): string
```

---

<a name="method-getgroup"></a>

### getGroup()
```php
getGroup(php\io\File $file): string
```

---

<a name="method-getparent"></a>

### getParent()
```php
getParent(php\io\File $file): php\io\File
```

---

<a name="method-listfiles"></a>

### listFiles()
```php
listFiles(php\io\File $file): array
```

---

<a name="method-findfile"></a>

### findFile()
```php
findFile(string $file, php\io\File $file1): php\io\File
```

---

<a name="method-readfile"></a>

### readFile()
```php
readFile(php\io\File $file, float $l): php\io\Stream
```

---

<a name="method-writefile"></a>

### writeFile()
```php
writeFile(php\io\File $file, float $l): php\io\Stream
```

---

<a name="method-mkdirs"></a>

### mkdirs()
```php
mkdirs(php\io\File $file): void
```

---

<a name="method-delete"></a>

### delete()
```php
delete(php\io\File $file): void
```

---

<a name="method-rename"></a>

### rename()
```php
rename(php\io\File $file, php\io\File $file1): void
```

---

<a name="method-chmod"></a>

### chmod()
```php
chmod(php\io\File $file, int $mode): void
```

---

<a name="method-touch"></a>

### touch()
```php
touch(php\io\File $file, float $l): void
```