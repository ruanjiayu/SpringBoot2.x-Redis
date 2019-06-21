package com.jing.modules.dto;

import lombok.*;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author ruanjiayu
 * @dateTime 2019/6/12 15:29
 */

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UsersDTO implements Serializable{

    private static final long serialVersionUID = -5573997958662012162L;

    private String id;

    private String username;

    private String password;

    private String permission;

}
