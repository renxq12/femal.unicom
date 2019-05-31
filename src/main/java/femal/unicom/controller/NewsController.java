package femal.unicom.controller;

import femal.unicom.entity.News;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "news")
public class NewsController {
    @RequestMapping(value="/getAll")
        public List<News> getAll(){
        System.out.println("tessssssssssssss");
        News news1= new News(1,"a","c");
        News news2= new News(2,"a","c");
        News news3= new News(2,"a","c");
        List<News> list = new ArrayList<News>();
        list.add(news1);
        list.add(news2);
        list.add(news3);
        System.out.println(list.size());
        return  list;
        }
}
