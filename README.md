## Задача №3. Меломан

Вы решили мотивировать пользователей покупать больше музыки с помощью скидки.

Чем большую сумму потратил пользователь, тем большую скидку вы ему даёте.

### Условия акции
* Если сумма покупки от 0 до 1 000 рублей, то скидка не предоставляется.
* Если сумма покупки от 1 001 до 10 000 рублей, то скидка составит 100 рублей (как в лекции).
* Если сумма покупки от 10 001 рубля и выше, то скидка составит 5% от суммы.

Все цены указаны в рублях.

При этом постоянные пользователи, то есть те, кто покупает ежемесячно, дополнительно получают 1% скидки сверху.

**Важно**: скидки не суммируются, а применяются сверху. Например, у пользователя скидка 5%, значит 1% применяется к 95%:
```
покупка — 100 рублей →

после применения 5% скидки — 95 рублей.

после применения 1% скидки — 94 рубля.
```

Подумайте, как вы будете хранить информацию о постоянных покупателях.

<details>
  <summary>Подсказка</summary>

  Почему бы эту информацию не хранить в виде `Boolean`?
</details>

Итог: у вас должен быть репозиторий на GitHub, в котором будет ваш Gradle-проект.