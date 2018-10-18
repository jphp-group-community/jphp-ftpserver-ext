<?php

namespace php\ftp;


use php\io\Stream;

class FTPConnection
{
    /**
     * @return float
     */
    public function getBytesTransferred() : float {}

    /**
     * @return bool
     */
    public function isAuthenticated() : bool {}

    /**
     * @return string
     */
    public function getUsername() : string {}

    /**
     * @return bool
     */
    public function isAsciiMode() : bool {}

    /**
     * @return FileSystem
     */
    public function getFileSystem() : FileSystem {}

    /**
     * @param FileSystem $fs
     */
    public function setFileSystem(FileSystem $fs) : void {}

    /**
     * @return bool
     */
    public function isSSLEnabled() : bool {}

    /**
     * @param int $code
     * @param string $response
     */
    public function sendResponse(int $code, string $response) : void {}

    /**
     * @param Stream $in
     */
    public function sendData(Stream $in) : void {}

    /**
     * @param Stream $out
     */
    public function receiveData(Stream $out) : void {}

    public function abortDataTransfers() : void {}

    /**
     * @param string $feat
     */
    public function registerFeature(string $feat) : void {}

    /**
     * @param string $option
     * @param string $value
     */
    public function registerOption(string $option, string $value) : void {}

    /**
     * @param string $option
     * @return string
     */
    public function getOption(string $option) : string {}

    /**
     * @param string $label
     * @return string
     */
    public function getSiteHelpMessage(string $label) : string {}

    /**
     * @param $label
     * @return string
     */
    public function getHelpMessage(string $label) : string {}

    public function close() : void {

    }
}