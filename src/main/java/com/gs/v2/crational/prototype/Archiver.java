package com.gs.v2.crational.prototype;

import java.io.File;



public interface Archiver {

    void archive(File directory);
   Archiver clone();
}
