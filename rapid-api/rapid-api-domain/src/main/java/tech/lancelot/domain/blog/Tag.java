package tech.lancelot.domain.blog;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author lancelot
 */
@Entity
@Getter
@Setter
@Table(name = "blog_tag")
public class Tag implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "主键", hidden = true)
    private Long id;

    @NotEmpty
    @Size(max = 30)
    @Column(nullable = false, length = 30)
    @ApiModelProperty(value = "标签名称")
    private String name;
}
