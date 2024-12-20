package ma.xproce.devoir.service;



import ma.xproce.devoir.dto.BookDTO;

import java.util.List;

public interface BookService {
    List<BookDTO> findBooksByTitle(String title);
    BookDTO saveBook(BookDTO bookDTO);
}
