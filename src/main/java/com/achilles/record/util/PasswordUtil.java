package com.achilles.record.util;

import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public final class PasswordUtil {

    static void main() {
        String pass = encode("123");
        System.out.println(pass);
        System.out.println(matches("1123", pass));
    }

    // 参数顺序：盐长度、哈希长度、并行度、内存（KiB）、迭代次数
    private static final PasswordEncoder ENCODER = Argon2PasswordEncoder.defaultsForSpringSecurity_v5_8();

    /** 注册时调用：返回需要保存到数据库的完整编码字符串 */
    public static String encode(String rawPassword) {
        if (rawPassword == null || rawPassword.isBlank()) {
            throw new IllegalArgumentException("密码不能为空");
        }
        return ENCODER.encode(rawPassword);
    }

    /** 登录时调用：rawPassword 是用户输入，encodedPassword 是数据库中保存的字符串 */
    public static boolean matches(String rawPassword, String encodedPassword) {
        if (rawPassword == null || encodedPassword == null) {
            return false;
        }
        return ENCODER.matches(rawPassword, encodedPassword);
    }
}