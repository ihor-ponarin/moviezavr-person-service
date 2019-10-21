package ua.pon.moviezavr.service.person.mapper;

import org.mapstruct.Mapper;
import ua.pon.moviezavr.service.person.dto.PersonDto;
import ua.pon.moviezavr.service.person.entity.PersonEntity;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    PersonDto personEntity2PersonDto(PersonEntity personEntity);
}
