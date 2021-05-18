package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @ResponseBody
    @RequestMapping(value="")
    public String SkillsList() {
        String html = "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>PHP</li>" +
                "</ol>";

        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String formSkills() {
        String html = "<form method='post'>" +
                "<Name: <br/>" +
                "<input type = 'text' name = 'name' />" +
                "<br>My favourite language: <br/>" +
                "<select name = 'firstChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'PHP'>PHP</option>" +
                "</select>" +
                "<br/>My second favourite language: <br/>" +
                "<select name = 'secondChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'PHP'>PHP</option>" +
                "</select>" +
                "<br/>My third favourite language: <br/>" +
                "<select name = 'thirdChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'PHP'>PHP</option>" +
                "</select>" +
                "<input type = 'submit' value = 'Submit' />" +
                "</form>";
        return html;

    }

@RequestMapping(value="formSubmitted", method = RequestMethod.POST)
    public String namePage(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        String html = name + "<h1>" + "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol>";
        return html;
}
}
