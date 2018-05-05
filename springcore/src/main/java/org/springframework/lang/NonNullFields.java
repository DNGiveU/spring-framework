package org.springframework.lang;

import java.lang.annotation.*;

/**
 * A common Spring annotation to declare that fields are to be considered as
 * non-nullable by default for a given package.
 *
 * <p>Leverages JSR-305 meta-annotations to indicate nullability in Java to common
 * tools with JSR-305 support and used by Kotlin to infer nullability of Spring API.</p>
 *
 * <p>Should be used at package level in association with {@link Nullable}
 * annotations at field level.</p>
 *
 * @author gaz
 * @data 2018/5/5
 */
@Target({ElementType.PACKAGE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
// @Nonnull
// @TypeQualifierNickname
public @interface NonNullFields {
}
