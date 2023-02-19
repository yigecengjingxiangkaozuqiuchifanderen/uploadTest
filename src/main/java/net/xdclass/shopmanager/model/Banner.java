package net.xdclass.shopmanager.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("banner")
public class Banner {
    private Integer id;

    private String img;

    private String url;

    private String weight;
}
