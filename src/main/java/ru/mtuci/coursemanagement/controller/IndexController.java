package ru.mtuci.coursemanagement.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.mtuci.coursemanagement.service.PluginLoader;

@Controller
@RequiredArgsConstructor
public class IndexController {
    private final PluginLoader loader;

    @GetMapping("/")
    public String index(Model model) {
        loader.tryLoad();
        return "index";
    }
}
