package com.ctrip.framework.apollo.spring.annotation;

import java.lang.annotation.*;

/**
 * @author Terry.Lam This annotation is used as a supplement to @EnableApolloConfig to fill in
 * multiple appid
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface MultipleConfig {

  /**
   * multiple appId
   * @return
   */
  String appId();


  String[] namespaces();

  /**
   * eg. ${apollo.multiple.shop.secret}
   * @return
   */
  String secret() default "";
}
