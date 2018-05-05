package org.springframework.lang;

import java.lang.annotation.*;

// import javax.annotation.Nonnull;
// import javax.annotation.meta.TypeQualifierNickname;

/**
 * A common Spring annotation to declare that annotated elements connot be {@code null}.
 * Leverages JSR 305 meta-annotations to indicate nullability in Java to common tools with
 * JSR 305 support and used by kotlin to infer nullability of spring API.
 *
 * <p>Should be used at parameter, return value, and field level. Method overrides should
 * repeat parent {@code @Nonnull} annotations unless they behave differently.</p>
 *
 * <p>Use {@code @NonNullApi} (scope = parameters + return values) and/or {@code @NonNullFields}
 * (scope = fields) to set the default behavior to non-nullable in order to avoid annotating
 * your whole codebase with {@code @NonNull}.</p>
 *
 * @author gaz
 * @data 2018/5/5
 */
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
// @Nonnull
// @TypeQualifierNickname
public @interface NonNull {
}
