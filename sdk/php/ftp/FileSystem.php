<?php

namespace php\ftp;


use php\io\File;
use php\io\Stream;

abstract class FileSystem
{
    /**
     * @return File
     */
    abstract public function getRoot() : File;

    /**
     * @return string
     */
    abstract public function getPath(File $file) : string;

    /**
     * @param File $file
     * @return bool
     */
    abstract public function exists(File $file) : bool;

    /**
     * @param File $file
     * @return bool
     */
    abstract public function isDirectory(File $file) : bool;

    /**
     * @param File $file
     * @return int
     */
    abstract public function getPermissions(File $file) : int;

    /**
     * @param File $file
     * @return float
     */
    abstract public function getSize(File $file) : float;

    /**
     * @param File $file
     * @return float
     */
    abstract public function getLastModified(File $file) : float;

    /**
     * @param File $file
     * @return int
     */
    abstract public function getHardLinks(File $file) : int;

    /**
     * @param File $file
     * @return string
     */
    abstract public function getName(File $file) : string;

    /**
     * @param File $file
     * @return string
     */
    abstract public function getOwner(File $file) : string;

    /**
     * @param File $file
     * @return string
     */
    abstract public function getGroup(File $file) : string;

    /**
     * @param File $file
     * @return File
     */
    abstract public function getParent(File $file) : File;

    /**
     * @param File $file
     * @return array
     */
    abstract public function listFiles(File $file) : array;

    /**
     * @param string $file
     * @param File|null $file1
     * @return File
     */
    abstract public function findFile(string $file, File $file1 = null) : File;

    /**
     * @param File $file
     * @param float $l
     * @return Stream
     */
    abstract public function readFile(File $file, float $l) : Stream;

    /**
     * @param File $file
     * @param float $l
     * @return Stream
     */
    abstract public function writeFile(File $file, float $l) : Stream;

    /**
     * @param File $file
     */
    abstract public function mkdirs(File $file) : void;


    /**
     * @param File $file
     */
    abstract public function delete(File $file) : void;


    /**
     * @param File $file
     * @param File $file1
     */
    abstract public function rename(File $file, File $file1) : void;


    /**
     * @param File $file
     * @param int $mode
     */
    abstract public function chmod(File $file, int $mode) : void;


    /**
     * @param File $file
     * @param float $l
     */
    abstract public function touch(File $file, float $l) : void;
}