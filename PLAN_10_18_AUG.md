# 📅 План подготовки Strong Senior Java Dev
## 10 августа — 18 августа 2026 (9 дней)

1)DeadLock
2)syncronization
3)volatile — visibility, happens-before, не атомарность
4)`equals` / `hashCode` contract — нарушения, последствия
5)N+1 — показать код до и после
6)`DDD` — Aggregate, Entity, Value Object, Repository, Domain Event, Bounded Context
7)- [ ] `Certificates` — X.509, CA, self-signed, Let's Encrypt, keystore/truststore
8)Lock, ReentrantLock, ReadWriteLock — vs synchronized
9)- [ ] **Servlet API** — ServletContext, HttpServletRequest/Response
10)- [ ] `DispatcherServlet` — полный request pipelined
11)- [ ] `ReturnValueHandler` — как сериализуется ответ
12)- [ ] `ViewResolver` — только концепция (для REST не нужен глубоко)
13)- [ ] Race Condition — примеры, как воспроизвести и исправить
14)- [ ] CountDownLatch, CyclicBarrier, Semaphore — разница и применение
15)- [ ] Java Memory Model — happens-before rules, memory barriers
16)- [ ] Atomic* — CAS, compare-and-swap, ABA problem
17)- [ ] wait() / notify() / notifyAll() — условие, spurious wakeup


- [ ] Visibility — что видит один поток из другого без синхронизации
- [ ] Exceptions — checked vs unchecked, иерархия, try-with-resources, multicatch, custom exceptions, ExceptionInInitializerError
- [ ] ExecutorService, ThreadPool, Executor — internals
- [ ] CompletableFuture — chain, thenApply, thenCompose, exceptionally, allOf
- [ ] ForkJoinPool — work stealing, рекурсивные задачи
- [ ] ConcurrentHashMap, BlockingQueue — внутренняя реализация

## 🗓 ДЕНЬ 2 — 11 августа (понедельник)

**Утро (блок 1)**
- [ ] **JVM Internals**: ClassLoader hierarchy, delegation model, загрузка классов
- [ ] **Heap / Stack / Metaspace** — что где хранится, примеры OOM
- [ ] **GC** — G1 (regions, mixed GC, evacuation failure), ZGC, Shenandoah
- [ ] **Garbage Collectors** — serial, parallel, CMS (deprecated), G1, ZGC, Shenandoah — сравнение и выбор
- [ ] **JIT** — C1/C2 compiler, tiered compilation, deoptimization
- [ ] **Escape Analysis** — stack allocation, scalar replacement
- [ ] **Concurrency в JVM** — как JVM управляет потоками, monitor object, thread states на уровне JVM
- [ ] **TLAB**, **Compressed Oops**, **Safepoints**

**День (блок 2)**
- [ ] **Bytecode** — javap, как читать, invokedynamic
- [ ] **Reflection** — getDeclaredMethods, setAccessible, performance cost
- [ ] **Annotation Processing** — APT, как работает во время компиляции
- [ ] **MethodHandle** — vs Reflection, LambdaMetafactory
- [ ] **Unsafe** — что умеет, где Spring/Hibernate используют

**Вечер (блок 3)**
- [ ] `Stream API` — lazy evaluation, spliterator, parallel streams
- [ ] `Optional` — правильное использование, антипаттерны
- [ ] `String Pool`, `String.intern()`, `StringBuilder` vs `StringBuffer`

---

## 🗓 ДЕНЬ 3 — 12 августа (вторник)
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
- [ ] `HandlerMapping` — `RequestMappingHandlerMapping`, как находит handler
- [ ] `HandlerAdapter` — `RequestMappingHandlerAdapter`
- [ ] `ArgumentResolver` — `HandlerMethodArgumentResolver`, как парсится тело запроса
- [ ] `MessageConverter` — `HttpMessageConverter`, JSON, XML
- [ ] `ExceptionResolver` — `@ControllerAdvice`, `@ExceptionHandler`
- [ ] `Filter` vs `Interceptor` — разница, когда что использовать
- [ ] **Embedded containers**: Embedded Tomcat, Undertow, Jetty — как встраиваются, auto-configuration


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

**Вечер (блок 3) — Architecture**
- [ ] `Clean Architecture` — dependency rule, use cases, entities
- [ ] `Hexagonal Architecture` — ports & adapters, inversion of control
- [ ] `Onion Architecture` — слои, dependency direction
- [ ] `Layered Architecture` — presentation → business → persistence, когда достаточно
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
- [ ] `Jenkins` — pipeline as code, Jenkinsfile
- [ ] `CI/CD` — stages: build → test → package → deploy
- [ ] `Blue Green` — переключение трафика, rollback
- [ ] `Canary` — постепенный rollout, % трафика
- [ ] `Rolling Update` — постепенная замена подов
- [ ] **Docker** — multi-stage build, layered jar, docker-compose, healthcheck (из SENIOR_EXTENDED)
- [ ] **Gradle** — `./gradlew bootJar`, `./gradlew dependencies`, Incremental builds, Build cache, `implementation`/`runtimeOnly`/`testImplementation` конфигурации (из SENIOR_EXTENDED)

**День (блок 2) — OOP + Enterprise Patterns**
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
- [ ] CAP theorem — пример с MongoDB, Cassandra, PostgreSQL
- [ ] Rate limiter design — token bucket алгоритм
- [ ] Distributed lock — Redisson, fencing token
- [ ] MVCC в PostgreSQL — xmin/xmax
- [ ] DispatcherServlet pipeline — все шаги
- [ ] Подготовить production incident story (реальный или придуманный детально)
- [ ] **Практические задачи** — реализовать реентерабельный distributed lock; спроектировать систему с eventual consistency; объяснить по EXPLAIN ANALYZE медленный запрос
