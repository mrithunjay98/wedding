package com.example.demo.controller;

import java.awt.Desktop;
import java.net.URI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class openwhtssaap {

	@RequestMapping("/open")
	public void open() {
		
		try {
            // WhatsApp Web URL
            String whatsappUrl = "https://web.whatsapp.com";

            // Create URI object
            URI uri = new URI(whatsappUrl);

            // Check if Desktop is supported and then open in the browser
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(uri);
            } else {
                System.out.println("Desktop is not supported on this platform.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}


	@RequestMapping("/home")
	public String  returnw() {
		
		return"index";
	}
	
	
	
	
	
}
