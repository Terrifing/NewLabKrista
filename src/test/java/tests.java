import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

public class tests {
    @Test
    void FacadeRequests (){
        FacadeInterface facade = new Facade();
        assertNotNull(facade, "newFacade");
        assertEquals(facade.addNews(1, "add News"), "add News");
        assertEquals(facade.addNews(2, "add News"), "add News");
        assertEquals(facade.addNews(3, "add News"), "add News");
        assertEquals(facade.getNews(1), "add News");
        assertEquals(facade.getNews(2), "add News");
        assertEquals(facade.getNews(3), "add News");
        assertEquals(facade.getAllNews(), "get All News");
        assertEquals(facade.delNews(), "del News");
        assertEquals(facade.upgradeNews(), "upgrade News");

        assertEquals(facade.getAllCategories(), "get All Categories");
        assertEquals(facade.addCategories(1,"sport"), "add Categories");
        assertEquals(facade.delCategories(), "del Categories");
        assertEquals(facade.upgradeCategories(), "upgrade Categories");
    }

}
