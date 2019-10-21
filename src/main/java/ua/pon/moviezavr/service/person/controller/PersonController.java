package ua.pon.moviezavr.service.person.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.pon.moviezavr.service.person.dto.PersonDto;
import ua.pon.moviezavr.service.person.mapper.PersonMapper;
import ua.pon.moviezavr.service.person.repository.PersonRepository;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static java.util.stream.StreamSupport.stream;

@RestController
@RequestMapping("/persons")
@Api(value = "persons")
public class PersonController {
    private PersonMapper personMapper;
    private PersonRepository personRepository;

    public PersonController(PersonMapper personMapper, PersonRepository personRepository) {
        this.personMapper = personMapper;
        this.personRepository = personRepository;
    }

    @GetMapping
    @ApiOperation("Get all persons")
    public List<PersonDto> findAll() {
        return stream(personRepository.findAll().spliterator(), false)
                .map(personMapper::personEntity2PersonDto)
                .collect(toList());
    }
}
