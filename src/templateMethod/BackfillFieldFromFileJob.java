package templateMethod;

import com.apple.eio.FileManager;

import javax.annotation.Resource;
import java.util.List;

public class BackfillFieldFromFileJob {
    @Resource
    private FileManager fileManager;

    @Resource
    private FieldService fieldService;


    public void execute(String[] args) {
        // task 0: verify environment
        verifyEnvironmet();

        // task 1: parameter check
        checkParameter();

        // task 2: Read backfill data from data source
        List<DataModel> result = fileManager.read();

        // task 3: Statisc data metric (count, notnull)
        recordMetric();

        // task 4: write data into storage
        fieldService.updateFiled();

        // task 5: post-backfill work
        postBackFill();
    }

    private void postBackFill() {
    }

    private void recordMetric() {
    }

    private void checkParameter() {
    }


    private void verifyEnvironmet() {
    }

    private static class FileManager {

        public List<DataModel> read() {
            return null;
        }
    }

    private static class FieldService {

        public void updateFiled() {

        }
    }

    private static class DataModel {
    }
}


