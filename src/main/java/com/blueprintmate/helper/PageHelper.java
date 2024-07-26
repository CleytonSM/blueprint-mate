package com.blueprintmate.helper;

import com.blueprintmate.model.dto.PageFilterDTO;
import com.blueprintmate.model.dto.PageResponseDTO;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public class PageHelper {
    public static Pageable setUpPageable(PageFilterDTO pageFilterDTO) {
        Sort sort = Sort.by(Sort.Direction.ASC, pageFilterDTO.getSortBy());

        return PageRequest.of(pageFilterDTO.getPageNumber(), pageFilterDTO.getPageSize(), sort);
    }

    public static <T> PageResponseDTO<T> setUpPageResponse(int number, int size, List<T> records) {
        return new PageResponseDTO<>(number, size, records);
    }
}
