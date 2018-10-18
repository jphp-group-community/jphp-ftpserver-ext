<?php

namespace php\ftp;


class NoOpAuthenticator extends UserAuthenticator
{
    public function __construct(FileSystem $fileSystem)
    {

    }
}