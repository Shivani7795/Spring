package com.xworkz.flower.dto;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadExcelFileToList {
    public static List<GamesDto> readExcelData(String fileName){
        List<GamesDto> gamesList = new ArrayList<GamesDto>();

        try {
            FileInputStream fis = new FileInputStream(fileName);

            Workbook workbook = null;
            if(fileName.toLowerCase().endsWith("xlsx")){
                workbook = new XSSFWorkbook(fis);
            }else if(fileName.toLowerCase().endsWith("xls")){
                workbook = new HSSFWorkbook(fis);
            }

            int numberOfSheets = workbook.getNumberOfSheets();

            for(int i=0; i < numberOfSheets; i++){

                Sheet sheet = workbook.getSheetAt(i);

               Iterator<Row> rowIterator = sheet.iterator();
                while (rowIterator.hasNext())
                {
                    String gNames = "";
                    String country = "";

                    Row row = rowIterator.next();

                    Iterator<Cell> cellIterator = row.cellIterator();

                    while (cellIterator.hasNext())
                    {
                        Cell cell = cellIterator.next();

                        switch(cell.getCellType()){
                            case Cell.CELL_TYPE_STRING:
                                if(country.equalsIgnoreCase("")){
                                    country = cell.getStringCellValue().trim();
                                }else if(gNames.equalsIgnoreCase("")){
                                    gNames = cell.getStringCellValue().trim();
                                }else{
                                    System.out.println("Random data::"+cell.getStringCellValue());
                                }
                                break;
                            case Cell.CELL_TYPE_NUMERIC:
                                System.out.println("Random data::"+cell.getNumericCellValue());
                        }
                    }
                    GamesDto c = new GamesDto(gNames, country);
                    gamesList.add(c);
                }
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gamesList;
    }

    public static void main(String args[]){
        List<GamesDto> list = readExcelData("D:\\Spring\\Spring\\Flower\\src\\main\\resources\\Games.xlsx");
        System.out.println("Country List\n"+list);
    }

}