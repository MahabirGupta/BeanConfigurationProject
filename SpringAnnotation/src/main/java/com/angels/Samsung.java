package com.angels;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component //Non qualified and Decapitalised("samsung")
public class Samsung {

    @Autowired
//    @Qualifier("mediaTek")
    @Qualifier("snapDragon")
     MobileProcessor mobileProcessor;

//     generate getters and setters


    public MobileProcessor getMobileProcessor() {
        return mobileProcessor;
    }

    public void setMobileProcessor(MobileProcessor mobileProcessor) {
        this.mobileProcessor = mobileProcessor;
    }

    //    create a config method
    public void config(){
        System.out.println("Octa Core, 4 GB RAM, 12MP camera ");
        mobileProcessor.process();
    }
}
