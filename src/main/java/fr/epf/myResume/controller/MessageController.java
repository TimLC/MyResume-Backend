package fr.epf.myResume.controller;

import fr.epf.myResume.DAO.MessageDAO;
import fr.epf.myResume.entities.Message;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/messages")
@CrossOrigin
@Api(description = "API for operations on messages.")
public class MessageController {
    private final MessageDAO messageDAO;

    public MessageController(MessageDAO messageDAO) {
        this.messageDAO = messageDAO;
    }

    @ApiOperation(value = "return all messages send.")
    @GetMapping
    public List<Message> getMessages() {
        Iterable<Message> it = this.messageDAO.findAll();
        List<Message> messages = new ArrayList<>();
        for (Message e : it) {
            messages.add(e);
        }

        return messages;
    }

    @ApiOperation(value = "return a message from its id.")
    @GetMapping("/{id}")
    public Message getMessage(@PathVariable Long id) {
        if (this.messageDAO.findById(id).isPresent()) {
            return this.messageDAO.findById(id).get();
        }
        return null;
    }

    @ApiOperation(value = "Add a message.")
    @PostMapping
    public Message addMessage(@RequestBody Message message) {
        return this.messageDAO.save(message);
    }

    @ApiOperation(value = "Update a message from its object")
    @PutMapping
    public void updateMessage(@RequestBody Message message) {
        this.messageDAO.save(message);
    }


}
