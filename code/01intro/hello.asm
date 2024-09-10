; nasm -f elf -o write.o write.S
 ; ld -m elf_i386 -s -o write.bin write.o
;
section .data
    hello db 'Hello, World!' , 0x0A ; 定义字符串 "Hello, World!" 并在末尾添加换行符

section .text
    global _main

_main:
    ; 写消息到 stdout
    mov eax, 4          ; 'write' 系统调用的编号是 4
    mov ebx, 1          ; 文件描述符 1 表示 stdout
    mov ecx, hello      ; 将字符串的地址放入 ecx
    mov edx, 13         ; 字符串的长度是 13
    int 0x80            ; 触发系统调用

    ; 退出程序
    mov eax, 1          ; 'exit' 系统调用的编号是 1
    xor ebx, ebx        ; 退出码 0
    int 0x80            ; 触发系统调用

