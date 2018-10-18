# FTPConnection

- **класс** `FTPConnection` (`php\ftp\FTPConnection`)
- **исходники** `php/ftp/FTPConnection.php`

---

#### Методы

- `->`[`getBytesTransferred()`](#method-getbytestransferred)
- `->`[`isAuthenticated()`](#method-isauthenticated)
- `->`[`getUsername()`](#method-getusername)
- `->`[`isAsciiMode()`](#method-isasciimode)
- `->`[`getFileSystem()`](#method-getfilesystem)
- `->`[`setFileSystem()`](#method-setfilesystem)
- `->`[`isSSLEnabled()`](#method-issslenabled)
- `->`[`sendResponse()`](#method-sendresponse)
- `->`[`sendData()`](#method-senddata)
- `->`[`receiveData()`](#method-receivedata)
- `->`[`abortDataTransfers()`](#method-abortdatatransfers)
- `->`[`registerFeature()`](#method-registerfeature)
- `->`[`registerOption()`](#method-registeroption)
- `->`[`getOption()`](#method-getoption)
- `->`[`getSiteHelpMessage()`](#method-getsitehelpmessage)
- `->`[`getHelpMessage()`](#method-gethelpmessage)
- `->`[`close()`](#method-close)

---
# Методы

<a name="method-getbytestransferred"></a>

### getBytesTransferred()
```php
getBytesTransferred(): float
```

---

<a name="method-isauthenticated"></a>

### isAuthenticated()
```php
isAuthenticated(): bool
```

---

<a name="method-getusername"></a>

### getUsername()
```php
getUsername(): string
```

---

<a name="method-isasciimode"></a>

### isAsciiMode()
```php
isAsciiMode(): bool
```

---

<a name="method-getfilesystem"></a>

### getFileSystem()
```php
getFileSystem(): php\ftp\FileSystem
```

---

<a name="method-setfilesystem"></a>

### setFileSystem()
```php
setFileSystem(php\ftp\FileSystem $fs): void
```

---

<a name="method-issslenabled"></a>

### isSSLEnabled()
```php
isSSLEnabled(): bool
```

---

<a name="method-sendresponse"></a>

### sendResponse()
```php
sendResponse(int $code, string $response): void
```

---

<a name="method-senddata"></a>

### sendData()
```php
sendData(php\io\Stream $in): void
```

---

<a name="method-receivedata"></a>

### receiveData()
```php
receiveData(php\io\Stream $out): void
```

---

<a name="method-abortdatatransfers"></a>

### abortDataTransfers()
```php
abortDataTransfers(): void
```

---

<a name="method-registerfeature"></a>

### registerFeature()
```php
registerFeature(string $feat): void
```

---

<a name="method-registeroption"></a>

### registerOption()
```php
registerOption(string $option, string $value): void
```

---

<a name="method-getoption"></a>

### getOption()
```php
getOption(string $option): string
```

---

<a name="method-getsitehelpmessage"></a>

### getSiteHelpMessage()
```php
getSiteHelpMessage(string $label): string
```

---

<a name="method-gethelpmessage"></a>

### getHelpMessage()
```php
getHelpMessage(string $label): string
```

---

<a name="method-close"></a>

### close()
```php
close(): void
```