package com.FlightsReservationApp.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.FlightsReservationApp.entities.Reservation;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfGenerator {
	
//	private static final String FILE_NAME = "E:\\tickets\\tickets2.pdf";

    

    public  void generatePDF(Reservation reserv,String filePath) {

        Document document = new Document();

        try {

            PdfWriter.getInstance(document, new FileOutputStream(new File(filePath)));

            //open
            document.open();

            Paragraph p = new Paragraph();
            p.add("Tickets");
            p.setAlignment(Element.ALIGN_CENTER);

            document.add(p);

//            Paragraph p2 = new Paragraph();
//            p2.add("This is my paragraph 2"); //no alignment
//
//            document.add(p2);

            Font f = new Font();
            f.setStyle(Font.BOLD);
            f.setSize(15);

            document.add(new Paragraph("Tickets Details:", f));

            PdfPTable table = new PdfPTable(2); // 3 columns.
            
            table.setWidthPercentage(100);
            table.setSpacingBefore(10f);
            table.setSpacingAfter(10f);
            
            PdfPCell cell1 = new PdfPCell(new Phrase("Flight Details:"));
            cell1.setColspan(2);
            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell1);
            
            table.addCell("Departure City");
            table.addCell(reserv.getFlight().getDepartureCity());
            
            table.addCell("Arrival City");
            table.addCell(reserv.getFlight().getArrivalCity());
            
            table.addCell("Flight Number");
            table.addCell(reserv.getFlight().getFlightNumber());
            
            table.addCell("Departur Time");
            table.addCell(reserv.getFlight().getEstimatedDepartureTime().toString());
            
            PdfPCell cell2 = new PdfPCell(new Phrase("Passenger Details:"));
            cell2.setColspan(2);
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell2);
            
            table.addCell("First Name");
            table.addCell(reserv.getPassenger().getFirstName());
            
            table.addCell("Last Name");
            table.addCell(reserv.getPassenger().getLastName());
            
            table.addCell("Middle Name");
            table.addCell(reserv.getPassenger().getMiddleName());
            
            table.addCell("Email");
            table.addCell(reserv.getPassenger().getEmail());
            
            table.addCell("Phone Number");
            table.addCell(reserv.getPassenger().getPhoneNo());

            document.add(table);

            document.close();

//            System.out.println("Done");
         
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

}
