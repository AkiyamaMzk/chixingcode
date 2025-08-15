package chixing.day10220.day20.hmwk.Q1;

import java.io.File;
import java.time.LocalDateTime;

import chixing.dayNull.SimpleFileUtils;
import chixing.dayNull.SimpleProxy;

public class OrderProxy extends SimpleProxy{

    public OrderProxy(Object target) {
        super(target);
    }

    @Override
    protected void addLog() {
        File log= SimpleFileUtils.createFile("jsd\\com\\chixing\\day10220\\day20\\hmwk\\Q1","log.json");
        SimpleFileUtils.writeToFile(log, "updatetime:"+LocalDateTime.now().toString(), true);
    }

    @Override
    protected boolean isPrintLog() {
        return super.isPrintLog();
    }
    
    
    

}
