package study.developia.login;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import study.developia.login.domain.item.Item;
import study.developia.login.domain.item.ItemRepository;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class TestDataInit {

    private final ItemRepository itemRepository;

    /**
     * 테스트용 데이터 추가
     */
    @PostConstruct
    public void init() {
        itemRepository.save(new Item("itemA", 10000, 10));
        itemRepository.save(new Item("itemB", 20000, 20));
    }

}