package com.csi.ContactController;

import com.csi.binding.Contact;
import com.csi.service.ContactService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value = "this is API")
public class ContactController {

    @Autowired
    ContactService contactService;

    @ApiOperation("This Operation is used to save the data")
    @PostMapping("/contact")
    public String createContact(@RequestBody Contact contact)
    {
        String status = contactService.saveData(contact);

        return status;
    }

    @ApiOperation("This Operation is used to save the data")
    @GetMapping("/contacts")
    public ResponseEntity<List<Contact>> getAllContacts()
    {
        return ResponseEntity.ok(contactService.getAllContacts());
    }

    @ApiOperation("This Operation is used to get the data")
    @GetMapping("/contact/{contactId}")
    public ResponseEntity<Contact> getContactById(@PathVariable Integer contactId)
    {
        return ResponseEntity.ok(contactService.getContactById(contactId));
    }

    @ApiOperation("This Operation is used to update the data")
    @PutMapping("/contact")
    public ResponseEntity<String> updateContact(@RequestBody Contact contact)
    {
        return ResponseEntity.ok(contactService.updateContact(contact));
    }

    @ApiOperation("This Operation is used to delete the data")
    @DeleteMapping("/contact/{contactId}")
    public ResponseEntity<String> deleteDataById(@PathVariable Integer contactId)
    {
        return ResponseEntity.ok(contactService.deleteContactById(contactId));
    }


}
