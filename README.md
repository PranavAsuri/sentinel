# Sentinel — API Reliability & Error Spike Detection System

Sentinel is a Java/Spring Boot service that ingests API request outcome events, learns baseline error behavior per endpoint, detects abnormal spikes in error rates, and alerts engineers early (e.g., Slack) before user impact.

> Status: 🚧 Under active development (MVP in progress). This repo is public to document engineering decisions, implementation, and results.

---

## What Sentinel Does (MVP)
1. Accepts request outcome events via an ingestion endpoint
2. Stores raw events and 1-minute aggregates in PostgreSQL
3. Computes a rolling baseline error rate per endpoint
4. Detects abnormal error-rate spikes over a recent window
5. Creates incidents and sends Slack webhook alerts
6. Includes unit + integration tests (Testcontainers)

---

## Tech Stack
- Java 21, Spring Boot 3
- PostgreSQL + Flyway migrations
- JUnit 5 + Testcontainers
- Spring Boot Actuator + Micrometer (Prometheus-ready)
- Docker (local dev + deployment)

---

## Current Progress
- [x] Repo initialized + Git workflow
- [ ] Spring Boot scaffold
- [ ] DB schema (Flyway)
- [ ] `POST /events` ingestion
- [ ] Aggregation (per-minute)
- [ ] Spike detection job
- [ ] Slack alerts
- [ ] Tests (unit + Testcontainers)
- [ ] Deployment

---

## Roadmap (Post-MVP)
- Time-of-day baseline to reduce false positives
- Better dedup/cooldown rules for alerts
- Optional ML anomaly scoring (only if it reduces alert noise)
- Optional LLM-generated incident summaries (assistive, not authoritative)
