package com.angels;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class SnapDragon implements MobileProcessor {
    @Override
    public void process() {
        System.out.println("World best cpu !!!");
    }
}
