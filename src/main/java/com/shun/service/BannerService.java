package com.shun.service;

import com.shun.entity.Banner;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface BannerService {
    Map findAll(Integer page,Integer rows);
    Map add(Banner banner);
    Map update(Banner banner);
    Map del(String[] ids);
    List<Banner> findAll();
    void getExcel(HttpServletResponse response);
    Map importExcel(MultipartFile file);

    void getEXCELModal(HttpServletResponse response) throws IOException;

    List<Banner> findByRandom(int i);
}
