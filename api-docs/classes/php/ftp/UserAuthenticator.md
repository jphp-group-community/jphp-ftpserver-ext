# UserAuthenticator

- **class** `UserAuthenticator` (`php\ftp\UserAuthenticator`)
- **source** `php/ftp/UserAuthenticator.php`

**Child Classes**

> [NoOpAuthenticator](https://github.com/jphp-group/jphp-ftpserver-ext/blob/master/api-docs/classes/php/ftp/NoOpAuthenticator.md)

---

#### Methods

- `->`[`needsUsername()`](#method-needsusername)
- `->`[`needsPassword()`](#method-needspassword)
- `->`[`authenticate()`](#method-authenticate)

---
# Methods

<a name="method-needsusername"></a>

### needsUsername()
```php
needsUsername(php\ftp\FTPConnection $connection): bool
```

---

<a name="method-needspassword"></a>

### needsPassword()
```php
needsPassword(php\ftp\FTPConnection $connection, string $s, string $host): bool
```

---

<a name="method-authenticate"></a>

### authenticate()
```php
authenticate(php\ftp\FTPConnection $connection, string $host, string $s, string $s1): php\ftp\FileSystem
```