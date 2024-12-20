package ma.xproce.devoir.service;

import ma.xproce.devoir.dao.entities.Book;
import ma.xproce.devoir.dao.repositories.BookRepository;
import ma.xproce.devoir.dto.BookDTO;
import ma.xproce.devoir.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImp implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<BookDTO> findBooksByTitle(String title) {
        return bookRepository.findByTitreContaining(title)
                .stream()
                .map(bookMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public BookDTO saveBook(BookDTO bookDTO) {
        Book book = bookMapper.toEntity(bookDTO);
        Book savedBook = bookRepository.save(book);
        return bookMapper.toDto(savedBook);
    }
}
