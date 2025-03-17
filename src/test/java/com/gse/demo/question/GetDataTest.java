package com.gse.demo.question;



import com.gse.demo.model.DataTest;
import com.gse.demo.util.files.excel.ConvertExcelSheet;

import java.util.List;

public class GetDataTest {

    public static List<DataTest> fromDataSource() throws Exception{

        ConvertExcelSheet convertExcelSheet =
                new ConvertExcelSheet("src/test/resources/data/data.xlsx","data");
        return convertExcelSheet.to(DataTest.class);

    }
}
