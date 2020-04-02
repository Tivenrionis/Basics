package com.tiven.questy.Interfaces;

import java.util.List;

public interface Saveable {

    List<String> write();

    void read(List<String> savedValues);

}
