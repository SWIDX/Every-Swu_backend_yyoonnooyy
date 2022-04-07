package com.yyoonnooyy.book.springboot.web;

import com.yyoonnooyy.book.springboot.service.posts.PostsService;
import com.yyoonnooyy.book.springboot.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Controller
@RestController
public class IndexController {

    private final PostsService postsService;

    // 메인 페이지
    @GetMapping("/")
    public String main() {
        return "everytime main page";
    }

    // 게시판(글) 조회
    @GetMapping("posts/read")
    public String postsRead() {
        return "posts-read page";
    }

    // 등록
    @GetMapping("posts/save")
    public String postsSave() {
        return "posts-save page";
    }

    // 수정
    @GetMapping("/posts/update/{id}")
    public String postsUpdate() {
        return "posts-update page";
    }

    // 삭제

}
