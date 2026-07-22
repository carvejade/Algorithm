-- 코드를 작성해주세요
SELECT ITEM_ID, ITEM_NAME, RARITY
FROM ITEM_INFO A
WHERE NOT EXISTS(SELECT *
     FROM ITEM_TREE B
     WHERE B.PARENT_ITEM_ID = A.ITEM_ID)
ORDER BY ITEM_ID DESC;                 

-- EXISTS      : 행이 존재하는지 확인

-- NOT EXISTS  : 행이 존재하지 않는지 확인 (NULL 걱정 X)

-- IN          : 값이 목록에 포함되는지 확인

-- NOT IN      : 값이 목록에 없는지 확인 (NULL 주의!)