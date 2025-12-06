# Contributing Guide

Before contributing code to Slimefun Chinese Version, you must read this contributing guide first.

# Setting Up Environment

We provide an automated format checking system. Please use `mvn install` for initialization.

This project already provides `.editorconfig` for controlling code style. If you have your own code style preferences, please switch to the current repository's style configuration before contributing to this repository.

# Commit Message Standards

This project **mandatorily uses** the [Conventional Commits](https://www.conventionalcommits.org/zh-hans/v1.0.0/) commit message standard.

> Simply put, your commit message needs to include the following:
> 
> <type>[optional scope]: <description>
> 
> For example, a commit that adds a new feature should be: feat(item): add new item to Slimefun

If your submitted code resolves or handles issues in Issues, please explicitly declare this outside the main commit message.

> Such as resolves #114514, fix #114514, etc.

If it's a fix, please declare it in the main commit message, no need to repeat the declaration.

The type prefixes we support are as follows: `(feat(ure)?|fix|docs|style|refactor|ci|chore|perf|build|test|revert|trans)`

Additionally, if it's a translation-related commit, the type should be trans.

# Code Standards

**!! This project uses 4-space indentation !!**

Please do not excessively reduce code length. Slimefun won't run faster just because there are fewer spaces.

We use Spotless as the code formatting tool. Before committing, you **must** use `mvn spotless:check spotless:apply` to automatically format your code, otherwise it will be blocked by the format checker in PR.

# Types of Code Submissions

Your submitted code can be fixes, new content, and APIs.

Downstream code now supports submitting API-related code. Developers can depend on the Chinese version of Slimefun through jitpack.
