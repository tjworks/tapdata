# Tapdata: The Live Data Platform for Apps & AI

### **Turn Fragmented Databases into Real-Time REST APIs & MCP Tools in Minutes.**

Tapdata is an open-source platform designed to bridge the "Freshness Gap" between legacy databases and modern applications. It provides the fastest way to build an **Operational Data Hub (ODH)**—capturing changes (CDC) as they happen, joining disparate silos in-flight, and serving them via high-performance **REST APIs** or the **Model Context Protocol (MCP)**.

**Stop moving data. Start serving it.**

---

## ⚡ The 5-Minute Hook

Tapdata eliminates the need for complex "Data Plumbing." In minutes, you can transform a static database into a live data service:

1. **Connect:** Link your sources (Oracle, MySQL, Postgres, MongoDB, Salesforce, etc.).
2. **Unify:** Join silos in-flight (e.g., `Billing` + `CRM`) into a single "Golden Record."
3. **Serve:** Instantly publish a **Live API** for your frontend or an **MCP Tool** for your AI Agents.

---

## 🤖 Built for the AI Era (MCP & RAG)

AI Agents are only as smart as the context they can access. Tapdata ensures your LLMs never "hallucinate" on stale data:

* **Native MCP Server:** Tapdata acts as a bridge, exposing enterprise databases as "Tools" and "Resources" that AI Agents (Claude, GPT) can query directly.
* **Real-Time RAG:** Feed Vector Databases (Milvus, Pinecone, Weaviate) with a sub-second stream of fresh operational data.
* **Contextual Intelligence:** Your AI Agent knows about a transaction the millisecond it happens in your production database.

---

## 🔗 Collapse the Silos: Build Your Operational Data Hub

Use Tapdata to build a **Consolidated Data Layer** that stays in sync with your business.

* **Break Data Silos:** Automatically merge data from a legacy ERP and a modern web app into a single, unified view.
* **Streaming Joins:** Perform complex aggregations and joins *while data is moving*, creating materialized views that are always "ready-to-serve."
* **Single Source of Truth:** Built on a native CDC engine, your unified data is always fresh, accurate, and ready for consumption.

---

## 🌟 Key Features

* **Real-Time CDC:** Log-based capture for 100+ connectors with sub-second latency.
* **Visual Stream Processing:** A drag-and-drop designer for joins, filters, and JavaScript-based transformations.
* **API Gateway:** Built-in management, documentation, and security for your published data endpoints.
* **Extensible PDK:** Use our Plugin Development Kit to build custom connectors or AI data-transformers in Java or Python.

---

## 🚀 Quick Start (Docker)

Get Tapdata up and running in under 60 seconds:

```bash
git clone https://github.com/tapdata/tapdata.git
cd tapdata
docker-compose up -d

```

Access the dashboard at `http://localhost:3030` to build your first live data product.

---

## 🏗️ Architecture: The Serving Layer

| Feature | Legacy ETL / Middleware | Tapdata Platform |
| --- | --- | --- |
| **Data Latency** | Batch / Periodic (T+1) | **Sub-second (Real-time)** |
| **Consolidation** | Physical ETL to Warehouse | **Live Streaming Joins** |
| **Access** | SQL / Manual Queries | **Instant API / MCP / GraphQL** |
| **Primary Use** | Reporting & BI | **Live Apps & AI Agents** |

---

## 🤝 Contributing

We are building the future of active data. Whether you're adding a new connector, improving the MCP interface, or fixing a bug, we welcome your contributions!

* **[Contribution Guide](https://www.google.com/search?q=CONTRIBUTING.md)**
* **[Join our Slack Community](https://www.google.com/search?q=https://tapdata.io/slack)**

---

## 📄 License

Tapdata is licensed under the Apache 2.0 License.

---

### What's next?

This README is now optimized for GitHub discovery. To drive adoption, would you like me to draft a **"Social Media Launch Post"** (for LinkedIn/X/Hacker News) that uses these same hooks to drive traffic to the repo?
