# 📅 План подготовки Strong Senior Java Dev
## 10 августа — 18 августа 2026 (9 дней)

## 🗓 ДЕНЬ 3 — 16 августа (вторник)
### Тема: Spring Core + Boot Internals (уровни 2–3)

**Утро (блок 1) — Spring Core Internals**
- [ ] `BeanFactory`, `DefaultListableBeanFactory` — как хранит и создаёт бины
- [ ] `Spring Beans` — scopes (singleton, prototype, request, session), lazy init, depends-on
- [ ] `Spring Context` — иерархия контекстов, parent/child context, refresh lifecycle
- [ ] `ApplicationContext` — иерархия, refresh(), events
- [ ] `BeanDefinition` — что это, как регистрируется
- [ ] `BeanDefinitionReader`, `ClassPathBeanDefinitionScanner`
- [ ] `AbstractAutowireCapableBeanFactory` — createBean() полный цикл
- [ ] **Bean Lifecycle**: instantiation → populate → Aware → BeanPostProcessor → init → use → destroy

**День (блок 2) — Spring AOP / Events / Other**
- [ ] `BeanPostProcessor` — postProcessBefore/AfterInitialization, примеры
- [ ] `BeanFactoryPostProcessor` — когда вызывается, зачем
- [ ] `FactoryBean` — vs обычный бин, `&beanName`
- [ ] **Spring AOP** — `CglibAopProxy`, `ProxyFactory`, `TransactionInterceptor`
- [ ] **Spring Events** — ApplicationEventPublisher, @EventListener, async events
- [ ] **Spring Expression Language (SpEL)** — синтаксис, применение в @Value, @Conditional
- [ ] **Spring Validation** — `@Valid`, `@Validated`, ConstraintValidator, groups, custom validator
- [ ] **Spring Conversion** — ConversionService, Converter, GenericConverter, FormatterRegistry
- [ ] **Spring Cache** — `@Cacheable`, `@CacheEvict`, `@CachePut`, CacheManager, TTL
- [ ] **Spring Scheduling** — `@Scheduled`, cron expression, fixedRate vs fixedDelay, TaskScheduler
- [ ] **Spring Async** — `@Async`, ThreadPoolTaskExecutor, propagation, exception handling
- [ ] **Spring Transaction** — `@Transactional`, propagation levels (REQUIRED, REQUIRES_NEW, NESTED), isolation, readOnly, rollbackFor
- [ ] **Spring Test** — `@SpringBootTest`, `@MockBean`, `@SpyBean`, context caching, test slices

**Вечер (блок 3) — Spring Boot Internals**
- [ ] `SpringApplication.run()` — полный путь от main() до готового контекста
- [ ] `AutoConfiguration` — `AutoConfiguration.imports`, `SpringFactories`
- [ ] `Condition Evaluation` — как Spring решает включать ли AutoConfiguration, порядок условий
- [ ] `Starter Dependencies` — структура starter (autoconfigure + starter pom), как работает подключение
- [ ] `ConditionEvaluator`, `@Conditional`, `@ConditionalOnClass`, `@ConditionalOnMissingBean`
- [ ] `ImportSelector`, `DeferredImportSelector` — как работает регистрация конфигураций
- [ ] `ConfigurationClassParser` — разбор `@Configuration` классов
- [ ] `Environment`, `PropertySources`, `Binder`, `ConfigurationProperties`
- [ ] `Profiles` — как активируются, priority порядок

---

## 🗓 ДЕНЬ 4 — 13 августа (среда)
### Тема: Spring MVC + Spring Data / Hibernate (уровни 4–5)

**Утро (блок 1) — Spring MVC Internals**
- [ ] `DispatcherServlet` — полный request pipeline
- [ ] `HandlerMapping` — `RequestMappingHandlerMapping`, как находит handler
- [ ] `HandlerAdapter` — `RequestMappingHandlerAdapter`
- [ ] `ArgumentResolver` — `HandlerMethodArgumentResolver`, как парсится тело запроса
- [ ] `ReturnValueHandler` — как сериализуется ответ
- [ ] `MessageConverter` — `HttpMessageConverter`, JSON, XML
- [ ] `ExceptionResolver` — `@ControllerAdvice`, `@ExceptionHandler`
- [ ] `ViewResolver` — только концепция (для REST не нужен глубоко)
- [ ] `Filter` vs `Interceptor` — разница, когда что использовать
- [ ] **Embedded containers**: Embedded Tomcat, Undertow, Jetty — как встраиваются, auto-configuration
- [ ] **Servlet API** — ServletContext, HttpServletRequest/Response

**День (блок 2) — Spring Data + JPA**
- [ ] `Persistence Context` — first-level cache, scope
- [ ] `Entity States`: transient → managed → detached → removed
- [ ] `Dirty Checking` — как Hibernate знает что изменилось (snapshot)
- [ ] `Flush` — ALWAYS, COMMIT, AUTO — когда SQL уходит в БД
- [ ] `Proxy` / `Bytecode Enhancement` — lazy loading mechanism
- [ ] `Cascade` — CascadeType values, orphanRemoval
- [ ] `Lazy Loading` — LazyInitializationException, решения

**Вечер (блок 3) — Hibernate Advanced**
- [ ] `N+1 проблема` — как обнаружить, JOIN FETCH, EntityGraph
- [ ] `Entity Graph` — @NamedEntityGraph, @EntityGraph в репозитории, ad-hoc graph
- [ ] `Fetch Plan` — FetchType.LAZY vs EAGER, когда что выбрать
- [ ] `Second Level Cache` — как настроить с Ehcache/Redis
- [ ] `Query Plan Cache` — HQL/JPQL кэш планов
- [ ] `Batching` — hibernate.jdbc.batch_size, batch inserts/updates
- [ ] `Locking` — Optimistic (@Version), Pessimistic (PESSIMISTIC_WRITE)
- [ ] `Natural ID` — альтернатива поиску по PK
- [ ] `Statistics` — как включить и читать hibernate.generate_statistics
- [ ] **Projections** — interface projection, DTO projection, dynamic projection — быстрее чем полный Entity
- [ ] **Maven/POM** — структура, dependency scopes, `<dependencyManagement>` vs `<dependencies>`, BOM, `nearest definition` (conflict resolution), `mvn dependency:tree`, `mvn dependency:analyze`, `<exclusions>`, lifecycle: validate→compile→test→package→verify→install→deploy, multi-module, profiles; плагины: `maven-compiler-plugin`, `maven-surefire-plugin`, `maven-failsafe-plugin`, `maven-shade-plugin`, `spring-boot-maven-plugin`, `maven-enforcer-plugin`, `versions-maven-plugin` (из SENIOR_EXTENDED)

---

## 🗓 ДЕНЬ 5 — 14 августа (четверг)
### Тема: Spring Security + Databases / PostgreSQL (уровни 6–7)

**Утро (блок 1) — Spring Security Internals**
- [ ] `FilterChain` — порядок фильтров, как запрос проходит через цепочку
- [ ] `UsernamePasswordAuthenticationFilter` — как обрабатывает форму/JSON
- [ ] `BearerTokenAuthenticationFilter` — JWT flow
- [ ] `AuthenticationManager` → `ProviderManager` → `AuthenticationProvider`
- [ ] `SecurityContext` / `SecurityContextHolder` — ThreadLocal, стратегии хранения
- [ ] `Method Security` — `@PreAuthorize`, `@PostAuthorize`, `@Secured`
- [ ] `CSRF` — как работает токен, когда отключать
- [ ] `OAuth2` — Authorization Code Flow, PKCE
- [ ] `OIDC` — ID Token, UserInfo endpoint
- [ ] `Authorization Server` — Spring Authorization Server
- [ ] `Resource Server` — валидация JWT, opaque tokens

**День (блок 2) — PostgreSQL Internals**
- [ ] `MVCC` — Multi-Version Concurrency Control, версии строк, xmin/xmax
- [ ] `VACUUM` — обычный vs AUTOVACUUM vs VACUUM FULL, bloat
- [ ] `WAL` — Write-Ahead Log, checkpoint, recovery
- [ ] `Isolation levels` — READ COMMITTED (default), REPEATABLE READ, SERIALIZABLE
- [ ] `Locks` — row-level, table-level, advisory locks, deadlocks
- [ ] `EXPLAIN ANALYZE` — Seq Scan, Index Scan, Hash Join, Nested Loop, cost

**Вечер (блок 3) — PostgreSQL Indexes + Transactions**
- [ ] `Indexes` — B-Tree, Hash, GIN, GiST, Partial, Composite (leftmost prefix rule)
- [ ] `Transactions` — BEGIN/COMMIT/ROLLBACK, savepoints
- [ ] `Deadlocks` — как обнаружить, `pg_locks`, `pg_stat_activity`
- [ ] `Planner` — statistics, `ANALYZE`, `pg_statistic`
- [ ] **SQL Advanced**: Window Functions, CTE, lateral joins; уровни изоляции: Dirty Read, Non-repeatable Read, Phantom Read (из SENIOR_EXTENDED)
- [ ] **REST API Design** — HTTP methods, idempotency; статус коды: `200 OK`, `201 Created`, `204 No Content`, `400 Bad Request`, `401 Unauthorized`, `403 Forbidden`, `404 Not Found`, `409 Conflict`, `422 Unprocessable Entity`, `500 Internal Server Error`, `502 Bad Gateway`, `503 Service Unavailable`; versioning, pagination, HATEOAS, `springdoc-openapi` / Swagger UI, Cursor-based pagination (из SENIOR_EXTENDED)

---

## 🗓 ДЕНЬ 6 — 15 августа (пятница)
### Тема: Messaging + Distributed Systems (уровни 8–9)

**Утро (блок 1) — Kafka**
- [ ] Kafka архитектура: broker, topic, partition, offset, consumer group
- [ ] Producer — batching, acks (0/1/all), idempotent producer, retries
- [ ] Consumer — poll loop, commit strategies (auto vs manual), rebalancing
- [ ] `Outbox Pattern` — атомарность запись в БД + публикация события
- [ ] `Saga Pattern` — choreography vs orchestration
- [ ] `Event Driven Architecture` — loose coupling, eventual consistency
- [ ] `CQRS` — разделение read/write модели, projections
- [ ] `Event Sourcing` — хранение событий, воспроизведение состояния

**День (блок 2) — RabbitMQ**
- [ ] Exchange types: direct, topic, fanout, headers
- [ ] Queue, binding, routing key
- [ ] Dead Letter Queue (DLQ) — что делать с failed messages
- [ ] Acknowledgment modes — auto, manual, reject/requeue
- [ ] RabbitMQ vs Kafka — когда что выбрать

**Вечер (блок 3) — Distributed Systems**
- [ ] `CAP theorem` — Consistency, Availability, Partition Tolerance, примеры баз
- [ ] `BASE` — Basically Available, Soft state, Eventual consistency
- [ ] `Consistency models` — strong, eventual, causal
- [ ] `Replication` — синхронная vs асинхронная, leader/follower
- [ ] `Partitioning` — horizontal sharding, consistent hashing
- [ ] `Leader Election` — зачем нужен, кто решает
- [ ] `Consensus` — Raft алгоритм — leader election, log replication
- [ ] `Distributed Locks` — Redis (Redisson), ZooKeeper, проблемы
- [ ] `Idempotency` — idempotency key, at-least-once vs exactly-once
- [ ] `Retry` — exponential backoff, jitter
- [ ] `Circuit Breaker` — Resilience4j: CLOSED → OPEN → HALF_OPEN
- [ ] `Backpressure` — как producer не перегружает consumer

---

## 🗓 ДЕНЬ 7 — 16 августа (суббота)
### Тема: Performance + JVM Tuning + Architecture (уровни 10–12)

**Утро (блок 1) — Performance Profiling**
- [ ] `JFR` (Java Flight Recorder) — включение, события, анализ
- [ ] `VisualVM` — heap dump, thread dump, CPU profiling
- [ ] `YourKit` / `JProfiler` — профессиональные профайлеры
- [ ] `Flame Graphs` — как читать, CPU hotspots
- [ ] `Heap Dump` — анализ в Eclipse MAT, dominator tree
- [ ] `Thread Dump` — jstack, как найти deadlock и long-running threads
- [ ] `GC Logs` — `-Xlog:gc*`, читать паузы, thrashing
- [ ] `CPU Profiling` — sampling vs instrumentation, hotspots, perf
- [ ] `Memory Profiling` — allocation profiling, retained heap, memory leaks
- [ ] `Micrometer` + `Prometheus` + `Grafana` — метрики в production
- [ ] **Observability** — structured logging, OpenTelemetry, tracing, Correlation-ID (из SENIOR_EXTENDED)

**День (блок 2) — JVM Tuning**
- [ ] **Heap** — `-Xms`, `-Xmx`, Young/Old generation
- [ ] **Stack** — `-Xss`, StackOverflowError
- [ ] **Metaspace** — `-XX:MaxMetaspaceSize`, OutOfMemoryError
- [ ] **G1 GC** — `-XX:+UseG1GC`, pause target, region size, mixed GC
- [ ] **ZGC** — concurrent, sub-millisecond pauses, когда выбрать
- [ ] **Shenandoah** — concurrent evacuation, Red Hat
- [ ] **TLAB** — Thread-Local Allocation Buffer
- [ ] **Compressed Oops** — экономия памяти на 64-bit JVM
- [ ] **Safepoints** — stop-the-world moments, time-to-safepoint
- [ ] **Virtual Threads** (Project Loom) — создание, ограничения, carrier threads
- [ ] **Structured Concurrency** — StructuredTaskScope
- [ ] **NIO** — Channels, Buffers, Selectors, non-blocking I/O
- [ ] **Network Programming** — TCP/IP, сокеты, HTTP client

**Вечер (блок 3) — Architecture**
- [ ] `Clean Architecture` — dependency rule, use cases, entities
- [ ] `Hexagonal Architecture` — ports & adapters, inversion of control
- [ ] `Onion Architecture` — слои, dependency direction
- [ ] `Layered Architecture` — presentation → business → persistence, когда достаточно
- [ ] `DDD` — Aggregate, Entity, Value Object, Repository, Domain Event, Bounded Context
- [ ] `Microservices` — decomposition strategies, communication (sync/async)
- [ ] `Modular Monolith` — vs Microservices, когда предпочтительнее
- [ ] `Event Driven` — choreography vs orchestration
- [ ] `Event-Driven Architecture` — loose coupling, eventual consistency, паттерны публикации событий
- [ ] `Vertical Slice` — организация по фичам, не слоям

---

## 🗓 ДЕНЬ 8 — 17 августа (воскресенье)
### Тема: Infrastructure + DevOps + Patterns + Testing + Production (уровни 13–17)

**Утро (блок 1) — Infrastructure + DevOps**
- [ ] `Kubernetes` — Pod, Deployment, Service, Ingress, ConfigMap, Secret
- [ ] `Helm` — chart structure, values.yaml, templates
- [ ] `Nginx` — reverse proxy, upstream, load balancing, SSL termination
- [ ] `Traefik` — dynamic configuration, Let's Encrypt
- [ ] `Linux` — процессы, signals, `/proc`, `systemd`, journalctl
- [ ] `Systemd` — unit files, systemctl, service lifecycle, targets
- [ ] `Networking` — TCP handshake, DNS resolution, TLS/SSL, certificates (chain, CA)
- [ ] `TLS` — handshake, symmetric/asymmetric encryption, certificate chain
- [ ] `Certificates` — X.509, CA, self-signed, Let's Encrypt, keystore/truststore
- [ ] `DNS` — A record, CNAME, TTL, round-robin DNS
- [ ] `Jenkins` — pipeline as code, Jenkinsfile
- [ ] `CI/CD` — stages: build → test → package → deploy
- [ ] `Blue Green` — переключение трафика, rollback
- [ ] `Canary` — постепенный rollout, % трафика
- [ ] `Rolling Update` — постепенная замена подов
- [ ] **Docker** — multi-stage build, layered jar, docker-compose, healthcheck (из SENIOR_EXTENDED)
- [ ] **Gradle** — `./gradlew bootJar`, `./gradlew dependencies`, Incremental builds, Build cache, `implementation`/`runtimeOnly`/`testImplementation` конфигурации (из SENIOR_EXTENDED)
- [ ] **Git Advanced** — `git rebase -i`, `git cherry-pick`, `git bisect`, `git reflog`, `git stash`/`git stash pop`, Gitflow vs Trunk-based, Conventional Commits (`feat:`, `fix:`, `chore:`)

**День (блок 2) — OOP + Enterprise Patterns**
- [ ] `Encapsulation`, `Abstraction`, `Polymorphism`, `Inheritance`, `Immutability`
- [ ] **GoF Creational**: Factory Method, Abstract Factory, Builder, Prototype, Singleton
- [ ] **GoF Structural**: Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy
- [ ] **GoF Behavioral**: Strategy, Observer, Command, State, Template Method, Chain of Responsibility, Mediator, Iterator, Visitor, Memento, Interpreter
- [ ] **Enterprise Patterns**: Repository, Specification, Decorator, Observer, Facade

**Вечер (блок 3) — Testing + Production**
- [ ] `JUnit 5` — @ParameterizedTest, @ExtendWith, @Nested
- [ ] `Mockito` — @Mock, @InjectMocks, verify, ArgumentCaptor
- [ ] `AssertJ` — fluent assertions
- [ ] `MockMvc` — тестирование Spring MVC без запуска сервера
- [ ] `WireMock` — mock внешних HTTP сервисов
- [ ] `Testcontainers` — реальная PostgreSQL/Kafka в тестах
- [ ] `Integration Tests` — @SpringBootTest, test slices (@WebMvcTest, @DataJpaTest)
- [ ] `Contract Tests` — Spring Cloud Contract, Pact
- [ ] `Performance Tests` — Gatling, k6, JMeter
- [ ] `Feature Flags` — LaunchDarkly, Togglz, strangler pattern
- [ ] `Rate Limiter` — bucket4j, Redis, алгоритмы (token bucket, leaky bucket)
- [ ] `Audit` — @CreatedBy, @LastModifiedBy, Spring Data Auditing
- [ ] `Soft Delete` — @SQLDelete, @Where, @Filter
- [ ] `Versioning` — API версионирование, entity versioning
- [ ] `Monitoring` — Spring Actuator endpoints, health indicators
- [ ] `Tracing` — micrometer-tracing, Zipkin/Jaeger
- [ ] `Correlation ID` — MDC, propagation через HTTP headers
- [ ] `Distributed Logs` — ELK stack (Elasticsearch + Logstash + Kibana)
- [ ] `Health Checks` — liveness vs readiness probe (Kubernetes)
- [ ] `Graceful Shutdown` — `server.shutdown=graceful`, `spring.lifecycle.timeout-per-shutdown-phase`
- [ ] **Redis** — паттерны: Cache-Aside, Write-Through, Write-Behind, Read-Through; Session storage (Spring Session); Rate limiting; Pub/Sub; Distributed lock (Redisson); Sorted Sets / leaderboards (из SENIOR_EXTENDED)
- [ ] **API Gateway / Service Mesh** — Spring Cloud Gateway, Istio, Envoy (из SENIOR_EXTENDED)
- [ ] **Reactive / WebFlux** — Project Reactor: `Mono<T>` (0..1), `Flux<T>` (0..N), backpressure, R2DBC, WebSocket, SSE (из SENIOR_EXTENDED)
- [ ] **Bulkhead** — изоляция ресурсов между сервисами, thread pool isolation, semaphore isolation (Resilience4j)
- [ ] **Strangler Fig** — паттерн постепенной миграции монолита на микросервисы

---

## 🗓 ДЕНЬ 9 — 18 августа (понедельник)
### Тема: Spring Source Code + Финальное закрепление + Mock Interview

**Утро (блок 1) — Исходники Spring (уровень 18)**
- [ ] Скачать Spring Framework исходники → читать через IDE
- [ ] `BeanFactory` → `DefaultListableBeanFactory` — `getBean()`, `doGetBean()`
- [ ] `AbstractApplicationContext` → `refresh()` — 12 шагов
- [ ] `SpringApplication.run()` — от main() до первого HTTP запроса
- [ ] `DispatcherServlet` → `doDispatch()` → handler selection → execution
- [ ] `RequestMappingHandlerAdapter` → `invokeHandlerMethod()`
- [ ] `DataBinder` → как Spring биндит параметры запроса
- [ ] `AnnotationConfigApplicationContext` — как читает @Configuration
- [ ] `ConditionEvaluator` → `shouldSkip()` — logic для AutoConfiguration
- [ ] `ConfigurationClassParser` → как разбирает @Import, @Bean, @ComponentScan
- [ ] `AbstractAutowireCapableBeanFactory` → `doCreateBean()`, `populateBean()`
- [ ] `CglibAopProxy` — как создаётся прокси
- [ ] `ProxyFactory` → `getProxy()` — JDK dynamic proxy vs CGLIB
- [ ] `TransactionInterceptor` → `invoke()` → как открывается транзакция

**День (блок 2) — Hibernate / OpenJDK / Custom Implementations**
- [ ] Прочитать Hibernate SessionImpl.save() / merge() flow
- [ ] Понять как работает dirty checking (EntityEntry + snapshot)
- [ ] Написать собственный `BeanPostProcessor` с реальной логикой
- [ ] Написать собственный `@Enable...` с `ImportSelector`
- [ ] Написать собственный `Condition` (`@ConditionalOn...`)
- [ ] Написать простой Spring Boot Starter (autoconfigure + starter модули)
- [ ] Написать собственный `Spring Boot AutoConfiguration` с нуля (META-INF/spring/…)
- [ ] Написать собственный `HandlerInterceptor`
- [ ] Написать собственный `ArgumentResolver`
- [ ] Написать собственный `Servlet Filter`
- [ ] Прочитать исходники OpenJDK — `HashMap`, `ArrayList`, `ThreadPoolExecutor`, `ForkJoinPool`
- [ ] Набросок простой IoC/DI библиотеки (BeanDefinition → create → inject)

**Вечер (блок 3) — Mock Interview + Закрепление**
- [ ] **Interview questions** — пройти весь список типичных вопросов из SENIOR_EXTENDED §13
- [ ] Ответить устно на все 15 вопросов (без подсказок)
- [ ] ClassLoader + delegation model
- [ ] JMM + happens-before — объяснить на примере
- [ ] G1 GC — mixed GC, evacuation failure
- [ ] HashMap internals — treeify порог, resize алгоритм
- [ ] Spring AutoConfiguration механизм — полный путь
- [ ] BeanPostProcessor — 3 примера из Spring (AutowiredAnnotationBeanPostProcessor, etc.)
- [ ] Hibernate dirty checking
- [ ] N+1 — показать код до и после
- [ ] CAP theorem — пример с MongoDB, Cassandra, PostgreSQL
- [ ] Rate limiter design — token bucket алгоритм
- [ ] Distributed lock — Redisson, fencing token
- [ ] MVCC в PostgreSQL — xmin/xmax
- [ ] DispatcherServlet pipeline — все шаги
- [ ] Подготовить production incident story (реальный или придуманный детально)
- [ ] **Практические задачи** — реализовать реентерабельный distributed lock; спроектировать систему с eventual consistency; объяснить по EXPLAIN ANALYZE медленный запрос

---

---

## 📊 Сводная таблица по дням

| День | Дата | Основные темы | Источники |
|------|------|---------------|-----------|
| 1 | 10.08 Вс | Multithreading, JMM, ExecutorService, CompletableFuture | куска.txt уровни 1–3 |
| 2 | 11.08 Пн | JVM Internals, GC, Reflection, Collections, Generics, Stream, Java 8+ | куска.txt уровень 11 + Java Core |
| 3 | 12.08 Вт | Spring Core + Boot Internals | куска.txt уровни 2–3 |
| 4 | 13.08 Ср | Spring MVC + Hibernate/JPA + Maven/POM | куска.txt уровни 4–5 + EXTENDED §1 |
| 5 | 14.08 Чт | Spring Security + PostgreSQL + REST Design | куска.txt уровни 6–7 + EXTENDED §5,§10 |
| 6 | 15.08 Пт | Kafka, RabbitMQ, Distributed Systems | куска.txt уровни 8–9 |
| 7 | 16.08 Сб | Performance, JVM Tuning, Architecture, Virtual Threads | куска.txt уровни 10–12 + EXTENDED §7,§8 |
| 8 | 17.08 Вс | Infrastructure (Systemd, TLS, Certificates), DevOps, OOP, Patterns, Testing, Production, Redis, Bulkhead, Strangler Fig | куска.txt уровни 13–17 + EXTENDED §3,§4,§9,§11,§12 |
| 9 | 18.08 Пн | Spring Source Code, Custom Implementations, Mock Interview | куска.txt уровень 18 + EXTENDED §13 |

---

## ⚡ Правила работы с планом

1. **Не листай — понимай.** Если тема знакома на 70% — проверь глубину: можешь объяснить без гугла?
2. **Код > слова.** По каждой теме написать хотя бы один пример кода из памяти.
3. **Три блока в день.** Утро / День / Вечер — каждый ~1.5–2 часа. Итого ~5 часов в день.
4. **Checkbox — только после понимания**, не после прочтения.
5. **День 9 (18.08)** — финальный: только повторение и mock interview. Никаких новых тем.

---

## 📚 Ссылки из плана (под рукой)

### Документация
- [High Scalability](http://highscalability.com/) — реальные архитектуры production систем
- [mvnrepository.com](https://mvnrepository.com/) — зависимости Maven
- [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
- [Spring Boot Maven Plugin](https://docs.spring.io/spring-boot/4.1.0/maven-plugin)
- [Create OCI image](https://docs.spring.io/spring-boot/4.1.0/maven-plugin/build-image.html)
- [Spring Web reference](https://docs.spring.io/spring-boot/4.1.0/reference/web/servlet.html)
- [Spring Boot DevTools](https://docs.spring.io/spring-boot/4.1.0/reference/using/devtools.html)
- [Spring Framework Source](https://github.com/spring-projects/spring-framework)
- [Baeldung](https://www.baeldung.com/) — Spring Boot практика
- [Vlad Mihalcea](https://vladmihalcea.com/) — JPA/Hibernate
- [Thorben Janssen](https://thorben-janssen.com/) — Hibernate tips
- [ByteByteGo](https://bytebytego.com/) — System Design
- [Martin Fowler](https://martinfowler.com/) — Architecture Patterns
- [PostgreSQL docs — indexes](https://www.postgresql.org/docs/current/indexes.html)

### Spring Guides
- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### YouTube
- [JUG.ru](https://www.youtube.com/@JUGRu) — доклады senior-уровня
- [1] https://www.youtube.com/watch?v=lRkIbVWcpg4
- [3] https://www.youtube.com/watch?v=plbIWp4F_g0&list=PL0lO_mIqDDFUzG5WOCUVmqx4CBW2qIulV&index=1
- [4] https://www.youtube.com/watch?v=hX-EIROSJRI
- [5] https://www.youtube.com/watch?v=dS2P-cV-Uzg
- [6] https://www.youtube.com/watch?v=xjusSinmONg
- [7] https://www.youtube.com/watch?v=6Oo-9Can3H8
- [8] https://www.youtube.com/watch?v=Z4hMFBvCDV4
- [9] https://www.youtube.com/watch?v=WH5UvQJizH0
- [10] https://www.youtube.com/watch?v=ImtZgX1nmr8
- [11] https://www.youtube.com/watch?v=_RSAS-gIjGo
- [12] https://www.youtube.com/watch?v=kj7dTH_soFQ
- [13] https://www.youtube.com/watch?v=9RFklLvoOr4
- [15] https://www.youtube.com/watch?v=0uwMKktzixU&list=PLiJ76e8LBYQVOHd1G3vva9FGV66sdV3N1
- https://www.youtube.com/watch?v=L9pOB3uSupA&list=PLt91xr-Pp57T4tvQ4if78_I83QytkUhmG
- https://www.youtube.com/watch?v=NCCQOw5d1lY
- https://www.youtube.com/watch?v=t0MfXYz7_Gk
- https://www.youtube.com/watch?v=oAXG7aUsF2Y
- https://www.youtube.com/watch?v=OyxTqMlRNdU
- https://www.youtube.com/watch?v=v5X2TJrSuCQ
