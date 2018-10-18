<?php

namespace php\ftp;


abstract class UserAuthenticator
{
    /**
     * @param FTPConnection $connection
     * @return bool
     */
    abstract public function needsUsername(FTPConnection $connection) : bool;

    /**
     * @param FTPConnection $connection
     * @param string $s
     * @param string $host
     * @return bool
     */
    abstract public function needsPassword(FTPConnection $connection, string $s, string $host) : bool;

    /**
     * @param FTPConnection $connection
     * @param string $host
     * @param string $s
     * @param string $s1
     * @return FileSystem
     */
    abstract public function authenticate(FTPConnection $connection, string $host, string $s, string $s1) : FileSystem;
}