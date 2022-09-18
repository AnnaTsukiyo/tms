package com.autoflex.tms.controllers;

import com.autoflex.tms.dto.bugDto.CreateBugDto;
import com.autoflex.tms.dto.bugDto.GetAllBugDto;
import com.autoflex.tms.services.BugService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/bugs")
public class BugController {
    @Resource
    BugService bugService;

    @PostMapping("/create")
    public GetAllBugDto createBug(@Valid @RequestBody CreateBugDto createBugDto) {
        Long id = bugService.createBug(createBugDto);
        return bugService.getById(id);
    }

    @GetMapping("/all")
    public List<GetAllBugDto> getAll() {
        return bugService.findAll();
    }
}
