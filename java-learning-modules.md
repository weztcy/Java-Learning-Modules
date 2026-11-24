# Portfolio Project Data — Java Learning Modules

- **Category:** `code-learning` (`Code Learning`)
- **Accent Color:** `orange`
- **Target Assets Folder:** `public/images/projects/java_learning_modules/`
- **Required Local Images:** `banner.webp` ONLY

## TypeScript Data (`ProjectCaseStudy`)

```typescript
{
  "id": "java-learning-modules",
  "code": "PRO-49 // CL-05",
  "title": "Java Learning Modules",
  "category": "code-learning",
  "categoryLabel": "Code Learning",
  "year": "2025",
  "status": "Completed",
  "accentColor": "orange",
  "repoUrl": "https://github.com/weztcy/Java-Learning-Modules",
  "license": "MIT License",
  "banner": "/images/projects/java_learning_modules/banner.webp",
  "summary": "An 18-module, 300-program Java curriculum spanning core syntax, OOP, collections, concurrency, JDBC, JVM internals, and layered projects.",
  "codeLearningDescription": "Java Learning Modules is an 18-module, 300-submodule curriculum in standalone Java for OpenJDK 17. Each module pairs a Markdown guide with runnable single-file programs and captured outputs, progressing from syntax basics to OOP, Streams, NIO, concurrency, JDBC, and layered REST projects.",
  "architectureSummary": "18 sequential module folders pairing Markdown study guides with 300 standalone runnable Java programs and captured console output screenshots.",
  "techStack": [
    "Java",
    "OpenJDK",
    "Java Standard Library",
    "Java Collections Framework",
    "Java Stream API",
    "Java NIO",
    "JDBC API",
    "Reflection API",
    "Markdown"
  ],
  "telemetryMatrix": {
    "projectType": "Modular Java Code Learning Curriculum",
    "targetPlatform": "OpenJDK 17 Cross-Platform JVM CLI",
    "primaryDomain": "Core Java, OOP, Concurrency & Backend",
    "architecturePipeline": "18 Modules, 300 Single-File Java Labs",
    "testingAndAudit": "Verified",
    "projectStatus": "Completed",
    "projectYear": "2025"
  },
  "codeLearningProjectInfo": {
    "learningCategory": "Java Programming & Backend Architecture Curriculum",
    "difficultyLevel": "Beginner to Advanced",
    "programmingLanguages": "Java"
  },
  "codeLearningObjectives": [
    {
      "title": "Core Java Syntax & Control Flow Mastery",
      "description": "Write and execute Java programs using primitive types, operators, CLI I/O, conditional branching, iterative loops, and modular methods.",
      "competencyCode": "COMP_01"
    },
    {
      "title": "Object-Oriented Design & Robust Error Handling",
      "description": "Model maintainable domain abstractions with encapsulation, inheritance, polymorphism, interfaces, Object contracts, and structured exception handling.",
      "competencyCode": "COMP_02"
    },
    {
      "title": "Collections, Generics & Functional Data Pipelines",
      "description": "Select optimal List, Set, Queue, and Map structures, enforce compile-time type safety with Generics, and process data declaratively via Lambdas and Streams.",
      "competencyCode": "COMP_03"
    },
    {
      "title": "I/O Persistence, Modern Java APIs & Concurrency",
      "description": "Manage filesystem NIO operations, serialization, BigDecimal precision, java.time, Reflection, Records, Sealed Classes, and thread-safe concurrent execution.",
      "competencyCode": "COMP_04"
    },
    {
      "title": "JDBC, Software Quality & Layered Architecture",
      "description": "Simulate relational JDBC DAO workflows, reflective unit testing, JVM memory inspection, cryptographic hashing, and Spring-style layered REST applications.",
      "competencyCode": "COMP_05"
    }
  ],
  "codeLearningPrerequisites": [
    {
      "category": "Runtime & Development Tooling",
      "items": [
        "OpenJDK 17 or newer (java and javac CLI)",
        "Git CLI for repository cloning",
        "Terminal environment (PowerShell, Bash, or Zsh)"
      ],
      "description": "Every module runs standalone on standard OpenJDK without external database servers, build tools, or third-party JAR downloads."
    },
    {
      "category": "Prior Knowledge Baseline",
      "items": [
        "Basic command-line directory navigation",
        "No prior Java experience required for Module 01"
      ],
      "description": "The curriculum starts from Hello World and JVM compilation fundamentals before progressing into intermediate and advanced engineering topics."
    }
  ],
  "codeLearningCurriculumStructure": {
    "summary": "The curriculum follows a linear 18-module progression divided into four phases. Learners start with JVM fundamentals, primitives, and control flow, advance through OOP, exceptions, collections, and Streams, master I/O, modern APIs, concurrency, and JDBC, and finish with JVM internals and five integrated projects.",
    "totalEstimatedHours": "75 Hours",
    "phases": [
      {
        "phaseNumber": "01",
        "phaseTitle": "Java Language Foundations & Control Flow",
        "difficulty": "Beginner",
        "moduleRange": "Modules 01 - 05",
        "topics": [
          "JVM Compilation & Program Structure",
          "Primitives, Strings & Type Casting",
          "CLI Input/Output & Operators",
          "Branching & Loops"
        ]
      },
      {
        "phaseNumber": "02",
        "phaseTitle": "Modularization, OOP, Collections & Functional Java",
        "difficulty": "Intermediate",
        "moduleRange": "Modules 06 - 12",
        "topics": [
          "Methods, Recursion & Arrays/Regex",
          "OOP Encapsulation, Inheritance & Polymorphism",
          "Exception Handling & Try-With-Resources",
          "Collections Framework, Generics & Stream API"
        ]
      },
      {
        "phaseNumber": "03",
        "phaseTitle": "Filesystem I/O, Modern Standard Library & Concurrency",
        "difficulty": "Advanced",
        "moduleRange": "Modules 13 - 15",
        "topics": [
          "File Streams, Serialization & Java NIO",
          "BigDecimal, java.time, Reflection, Records & Sealed Classes",
          "Threads, Locks, Atomics, ExecutorService & CompletableFuture"
        ]
      },
      {
        "phaseNumber": "04",
        "phaseTitle": "JDBC, JVM Quality & Enterprise Capstone Projects",
        "difficulty": "Advanced",
        "moduleRange": "Modules 16 - 18",
        "topics": [
          "JDBC CRUD, Transactions, DAO & Pooling",
          "Reflective Unit Testing, Build Lifecycles, JVM GC & Cryptography",
          "Spring-Style Layered Architecture & 5 Capstone Projects"
        ]
      }
    ]
  },
  "codeLearningModules": [
    {
      "id": "mod-01",
      "moduleNumber": "01",
      "title": "Introduction to Java & Program Structure",
      "description": "Covers Java program anatomy, main entry points, comments, console printing (print, println, printf), statements, identifiers, keywords, and JVM compilation.",
      "submoduleCount": 10,
      "difficulty": "Beginner",
      "keyTopics": ["Hello World", "Main Method", "Console Output", "Identifiers & Keywords", "JVM Execution"],
      "sourceFilesCount": 10,
      "estimatedHours": "2 Hours"
    },
    {
      "id": "mod-02",
      "moduleNumber": "02",
      "title": "Variables & Data Types",
      "description": "Explores variable declaration and initialization, all eight Java primitive types, String reference immutability, final constants, widening conversion, and narrowing casting.",
      "submoduleCount": 14,
      "difficulty": "Beginner",
      "keyTopics": ["8 Primitive Types", "String Immutability", "Final Constants", "Type Casting"],
      "sourceFilesCount": 14,
      "estimatedHours": "3 Hours"
    },
    {
      "id": "mod-03",
      "moduleNumber": "03",
      "title": "Input, Output & Operators",
      "description": "Teaches Scanner and BufferedReader input, CLI arguments, arithmetic, relational, logical, bitwise, and ternary operators, precedence rules, String formatting, and Math utilities.",
      "submoduleCount": 14,
      "difficulty": "Beginner",
      "keyTopics": ["Scanner & BufferedReader", "CLI Arguments", "Bitwise & Ternary", "Math Class"],
      "sourceFilesCount": 14,
      "estimatedHours": "3 Hours"
    },
    {
      "id": "mod-04",
      "moduleNumber": "04",
      "title": "Conditional Branching & Decision Making",
      "description": "Covers if, if-else, else-if ladders, nested branching, classic switch, arrow-based switch expressions, and applied calculators for grades, leap years, login, and discounts.",
      "submoduleCount": 12,
      "difficulty": "Beginner",
      "keyTopics": ["If-Else Ladders", "Switch Statements", "Switch Expressions", "Validation Cases"],
      "sourceFilesCount": 12,
      "estimatedHours": "3 Hours"
    },
    {
      "id": "mod-05",
      "moduleNumber": "05",
      "title": "Loops & Iteration Control",
      "description": "Demonstrates for, while, do-while, nested loops, break/continue, labeled jumps, enhanced for-each loops, counters, accumulators, factorials, and visual number patterns.",
      "submoduleCount": 14,
      "difficulty": "Beginner",
      "keyTopics": ["For/While/Do-While", "Labeled Break & Continue", "Enhanced For", "Pattern Algorithms"],
      "sourceFilesCount": 14,
      "estimatedHours": "3 Hours"
    },
    {
      "id": "mod-06",
      "moduleNumber": "06",
      "title": "Methods & Program Modularization",
      "description": "Introduces method signatures, parameters, return values, void methods, overloading, varargs, variable scope, static vs instance methods, recursion, method references, and packages.",
      "submoduleCount": 14,
      "difficulty": "Intermediate",
      "keyTopics": ["Method Overloading", "Varargs", "Variable Scope", "Recursion & Packages"],
      "sourceFilesCount": 14,
      "estimatedHours": "4 Hours"
    },
    {
      "id": "mod-07",
      "moduleNumber": "07",
      "title": "Arrays & String Manipulation",
      "description": "Covers 1D and multidimensional arrays, linear search, sorting, 2x2 matrix operations, String Pool comparison, StringBuilder, StringBuffer, regular expressions, and text processing.",
      "submoduleCount": 22,
      "difficulty": "Intermediate",
      "keyTopics": ["1D & Matrix Arrays", "Search & Sorting", "StringBuilder & StringBuffer", "Regular Expressions"],
      "sourceFilesCount": 22,
      "estimatedHours": "5 Hours"
    },
    {
      "id": "mod-08",
      "moduleNumber": "08",
      "title": "Object-Oriented Programming (OOP) Basics",
      "description": "Builds core OOP modeling with classes, object instantiation, constructors and overloading, this keyword, access modifiers, encapsulation, static blocks, final, and Object contracts.",
      "submoduleCount": 20,
      "difficulty": "Intermediate",
      "keyTopics": ["Classes & Constructors", "Access Modifiers", "Encapsulation", "toString/equals/hashCode"],
      "sourceFilesCount": 20,
      "estimatedHours": "5 Hours"
    },
    {
      "id": "mod-09",
      "moduleNumber": "09",
      "title": "Advanced Object-Oriented Programming",
      "description": "Explores single, multilevel, and hierarchical inheritance, super, overriding, runtime polymorphism, abstract classes, interfaces with default/static methods, composition, aggregation, and nested classes.",
      "submoduleCount": 20,
      "difficulty": "Intermediate",
      "keyTopics": ["Inheritance & Polymorphism", "Abstract Classes", "Interfaces", "Composition & Nested Classes"],
      "sourceFilesCount": 20,
      "estimatedHours": "5 Hours"
    },
    {
      "id": "mod-10",
      "moduleNumber": "10",
      "title": "Exception Handling & Resilience",
      "description": "Covers try-catch-finally, throw/throws, checked vs unchecked exceptions, custom domain exceptions, propagation, chaining, try-with-resources, multi-catch, assertions, and stack traces.",
      "submoduleCount": 16,
      "difficulty": "Intermediate",
      "keyTopics": ["Checked vs Unchecked", "Custom Exceptions", "Try-With-Resources", "Exception Chaining"],
      "sourceFilesCount": 16,
      "estimatedHours": "4 Hours"
    },
    {
      "id": "mod-11",
      "moduleNumber": "11",
      "title": "Java Collections Framework",
      "description": "Covers ArrayList, LinkedList, Stack, Queue, PriorityQueue, ArrayDeque, HashSet, LinkedHashSet, TreeSet, HashMap, TreeMap, Iterators, Comparable, Comparator, and immutable factory collections.",
      "submoduleCount": 22,
      "difficulty": "Intermediate",
      "keyTopics": ["List, Set & Queue", "Map Implementations", "Comparable & Comparator", "Immutable Collections"],
      "sourceFilesCount": 22,
      "estimatedHours": "5 Hours"
    },
    {
      "id": "mod-12",
      "moduleNumber": "12",
      "title": "Generics & Functional Programming",
      "description": "Teaches generic classes, methods, bounds, wildcards, type erasure, Lambda expressions, Predicate/Function/Consumer/Supplier, method references, and Stream API pipelines including parallel streams.",
      "submoduleCount": 22,
      "difficulty": "Intermediate",
      "keyTopics": ["Generics & Wildcards", "Type Erasure", "Lambda & Method References", "Stream API"],
      "sourceFilesCount": 22,
      "estimatedHours": "6 Hours"
    },
    {
      "id": "mod-13",
      "moduleNumber": "13",
      "title": "File Handling & Filesystem I/O",
      "description": "Covers File metadata, buffered text and binary streams, object serialization with transient protection, Java NIO Path/Files, CSV parsing, Properties files, ZIP archives, and WatchService.",
      "submoduleCount": 18,
      "difficulty": "Advanced",
      "keyTopics": ["Buffered & Byte Streams", "Serialization", "Java NIO Files", "CSV, ZIP & WatchService"],
      "sourceFilesCount": 18,
      "estimatedHours": "5 Hours"
    },
    {
      "id": "mod-14",
      "moduleNumber": "14",
      "title": "Standard Library & Modern Language Features",
      "description": "Covers SecureRandom, BigInteger, BigDecimal, java.time date/zone APIs, Optional, UUID, rich Enums, custom annotations with Reflection API, Records, and Sealed Classes.",
      "submoduleCount": 18,
      "difficulty": "Advanced",
      "keyTopics": ["BigDecimal & SecureRandom", "java.time & Optional", "Annotations & Reflection", "Records & Sealed Classes"],
      "sourceFilesCount": 18,
      "estimatedHours": "5 Hours"
    },
    {
      "id": "mod-15",
      "moduleNumber": "15",
      "title": "Multithreading & Concurrency",
      "description": "Explores Thread, Runnable, Callable/Future, thread lifecycle, synchronized methods/blocks, volatile, ReentrantLock, AtomicInteger, ExecutorService, ScheduledExecutorService, CompletableFuture, and concurrent collections.",
      "submoduleCount": 16,
      "difficulty": "Advanced",
      "keyTopics": ["Threads & Callables", "Locks & Atomics", "ExecutorService", "CompletableFuture"],
      "sourceFilesCount": 16,
      "estimatedHours": "5 Hours"
    },
    {
      "id": "mod-16",
      "moduleNumber": "16",
      "title": "Database Programming with JDBC",
      "description": "Demonstrates JDBC connection lifecycle, DriverManager, Statement vs PreparedStatement, ResultSet CRUD, ACID transactions, batch processing, DatabaseMetaData, DAO pattern, and connection pooling via an educational JDBC driver simulator.",
      "submoduleCount": 14,
      "difficulty": "Advanced",
      "keyTopics": ["PreparedStatement & ResultSet", "ACID Transactions", "Batch Processing", "DAO & Connection Pooling"],
      "sourceFilesCount": 14,
      "estimatedHours": "4 Hours"
    },
    {
      "id": "mod-17",
      "moduleNumber": "17",
      "title": "Testing, Build Tools, JVM & Security",
      "description": "Covers reflective unit testing and mocking concepts, Maven/Gradle lifecycle models, JAR packaging, JavaDoc, logging, JVM memory/GC concepts, Java 14-17 syntax, JPMS, SHA-256/AES cryptography, and static analysis.",
      "submoduleCount": 22,
      "difficulty": "Advanced",
      "keyTopics": ["Unit Testing & Mocking", "Build Lifecycles & JAR", "JVM Memory & GC", "Cryptography & Static Analysis"],
      "sourceFilesCount": 22,
      "estimatedHours": "5 Hours"
    },
    {
      "id": "mod-18",
      "moduleNumber": "18",
      "title": "Java Frameworks & Integrated Practical Projects",
      "description": "Simulates Spring IoC/DI, Spring Boot startup, REST controllers, JPA repositories, validation, security RBAC, and MockMvc testing, culminating in five end-to-end console capstone applications.",
      "submoduleCount": 12,
      "difficulty": "Advanced",
      "keyTopics": ["IoC & Dependency Injection", "REST, Validation & Security", "Layered Architecture", "5 Capstone Projects"],
      "sourceFilesCount": 12,
      "estimatedHours": "6 Hours"
    }
  ],
  "codeLearningPracticalProjects": [
    {
      "title": "Console Calculator with Transaction History",
      "description": "Implements a console arithmetic engine supporting addition, subtraction, multiplication, division, modulo, and exponentiation with zero-division validation and chronological operation history logging.",
      "highlights": [
        "Supports six arithmetic operators with division-by-zero error guarding",
        "Records and prints formatted sequential calculation history logs"
      ],
      "coreScope": "Arithmetic engine, validation logic, and history state tracking",
      "trackTag": "Capstone Project 01",
      "tier": "Core",
      "difficulty": "Intermediate",
      "estimatedTime": "1.5 Hours",
      "architecturalConstraints": [
        "Single-file pure Java execution with zero external dependencies",
        "Explicit validation guard before division execution"
      ]
    },
    {
      "title": "Student Information Management System",
      "description": "Models academic student records (NIM, name, major, GPA) with full CRUD operations, lookup search, mutation logging, tabular console reporting, and cohort GPA statistical aggregation.",
      "highlights": [
        "Implements complete Create, Read, Update, and Delete student workflows",
        "Computes cohort average GPA and renders structured console tables"
      ],
      "coreScope": "Domain entity modeling, CRUD collection management, and GPA analytics",
      "trackTag": "Capstone Project 02",
      "tier": "Core",
      "difficulty": "Intermediate",
      "estimatedTime": "2 Hours",
      "architecturalConstraints": [
        "In-memory collection persistence using OOP encapsulation",
        "Deterministic console table formatting"
      ]
    },
    {
      "title": "Warehouse Inventory Management System",
      "description": "Tracks warehouse item quantities, inbound/outbound stock mutations, automated low-stock alerts below a 5-unit threshold, and total warehouse asset valuation.",
      "highlights": [
        "Monitors inbound and outbound stock mutation logs",
        "Flags critical low-stock items under 5 units and computes total asset value"
      ],
      "coreScope": "Stock mutation ledger, threshold alerting, and inventory valuation",
      "trackTag": "Capstone Project 03",
      "tier": "Core",
      "difficulty": "Intermediate",
      "estimatedTime": "2 Hours",
      "architecturalConstraints": [
        "Guard against invalid stock reductions",
        "Real-time threshold filtering and monetary aggregation"
      ]
    },
    {
      "title": "Regional Library Circulation & Fine System",
      "description": "Manages library catalog availability states, member borrowing workflows, duplicate-loan rejection, and daily overdue fine computation upon late book returns.",
      "highlights": [
        "Prevents duplicate borrowing of checked-out catalog titles",
        "Calculates daily overdue return fines and prints before/after catalog states"
      ],
      "coreScope": "Book state machine, circulation validation, and fine calculation",
      "trackTag": "Capstone Project 04",
      "tier": "Core",
      "difficulty": "Advanced",
      "estimatedTime": "2.5 Hours",
      "architecturalConstraints": [
        "Strict availability state transition enforcement",
        "Deterministic daily overdue fee rules"
      ]
    },
    {
      "title": "Layered REST API Architecture Simulation",
      "description": "Implements an end-to-end enterprise REST simulation separating Controller, Service, Repository, Request/Response DTOs, JSON serialization, and 404 global exception handling.",
      "highlights": [
        "Enforces strict Controller -> Service -> Repository separation of concerns",
        "Simulates POST, GET, PUT, DELETE CRUD endpoints and 404 Not Found error responses"
      ],
      "coreScope": "Layered backend architecture, DTO mapping, and exception handling",
      "trackTag": "Capstone Project 05",
      "tier": "Advanced",
      "difficulty": "Advanced",
      "estimatedTime": "3 Hours",
      "architecturalConstraints": [
        "Pure Java interface-driven layering without external Spring JARs",
        "Separate RequestDTO and ResponseDTO contracts with Optional lookup"
      ]
    }
  ],
  "codeLearningOutcomes": [
    {
      "pillar": "Core Language & Object-Oriented Engineering",
      "skills": [
        {
          "title": "Structured Syntax & Control Flow",
          "description": "Build modular Java programs using primitives, operators, switch expressions, loops, recursion, and regex text processing."
        },
        {
          "title": "OOP & Contract Design",
          "description": "Architect extensible class hierarchies with encapsulation, interfaces, composition, polymorphism, and custom exception hierarchies."
        }
      ]
    },
    {
      "pillar": "Data Processing, Concurrency & Persistence",
      "skills": [
        {
          "title": "Collections, Generics & Stream Pipelines",
          "description": "Choose appropriate JCF structures and compose type-safe generic abstractions with declarative Stream filtering, mapping, and grouping."
        },
        {
          "title": "Concurrent, NIO & JDBC Workflows",
          "description": "Implement thread-safe execution with locks and CompletableFuture, NIO filesystem operations, and transactional DAO database patterns."
        }
      ]
    },
    {
      "pillar": "Software Quality & Layered Architecture",
      "skills": [
        {
          "title": "Testing, JVM & Security Awareness",
          "description": "Apply unit testing isolation, JVM memory/GC concepts, SHA-256/AES cryptographic primitives, and static analysis principles."
        },
        {
          "title": "Enterprise Layered Design",
          "description": "Structure backend applications across Controller, Service, Repository, and DTO layers with dependency injection and centralized error handling."
        }
      ]
    }
  ],
  "codeLearningCurriculumSpecs": {
    "curriculumTrack": "Core to Enterprise Java",
    "primaryLanguage": "Java",
    "executionRuntime": "OpenJDK Runtime",
    "testVerification": "Captured Console Outputs"
  },
  "codeLearningSupplementaryResources": [
    {
      "title": "Module Study & Practical Guides",
      "description": "Each of the 18 modules contains an Indonesian-language Markdown guide detailing module objectives, key concepts, source explanations, run commands, and expected outputs.",
      "resources": [
        {
          "name": "module-01 to module-18 README.md Guides (18 Files)",
          "type": "Reference Guide",
          "format": "MD"
        }
      ]
    },
    {
      "title": "Verified Console Execution Captures",
      "description": "Every submodule includes a captured PNG screenshot inside its module output/ directory verifying actual console output on OpenJDK 17.",
      "resources": [
        {
          "name": "module-01 to module-18 output/*.png Captures (300 Files)",
          "type": "Execution Output",
          "format": "PNG"
        }
      ]
    }
  ]
}
```
