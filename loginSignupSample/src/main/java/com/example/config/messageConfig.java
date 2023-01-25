package com.example.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import lombok.var;

/**
 * i18n配下にある外部プロパティ接続クラス
 * 
 * @author yukishi
 *
 */
@Configuration
public class messageConfig {

  @Bean
  public MessageSource messageSource() {
    var source = new ReloadableResourceBundleMessageSource();

    // 読み込むメッセージファイルを設定
    source.setBasename("classpath:i18n/message.yml");
    // メッセージの文字コードを設定
    source.setDefaultEncoding("UTF-8");
    // システムの言語に関係なく、デフォルトのメッセージを返せるようにする
    source.setFallbackToSystemLocale(false);
    return source;
  }

  @Bean
  public LocalValidatorFactoryBean getValidator() {
    // 上のメソッドをセット
    var bean = new LocalValidatorFactoryBean();
    bean.setValidationMessageSource(messageSource());
    return bean;
  }
}
